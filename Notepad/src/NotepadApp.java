import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;
import java.io.*;

public class NotepadApp extends JFrame implements ActionListener {
	
	private TextArea textArea = new TextArea("", 0,0 , TextArea.SCROLLBARS_VERTICAL_ONLY);
	private MenuBar menuBar = new MenuBar();
	private Menu file = new Menu();
	private MenuItem openFile = new MenuItem();
	private MenuItem saveFile = new MenuItem();
	private MenuItem closeFile = new MenuItem();
	
	public NotepadApp() {
		this.setSize(500,300);
		this.setTitle("My Java Notepad");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.textArea.setFont(new Font("Century Gothic", Font.BOLD, 12));
		this.getContentPane().setLayout(new BorderLayout());
		this.getContentPane().add(textArea);
		
		//add the menu bar to the GUI
		this.setMenuBar(this.menuBar);
		this.menuBar.add(this.file);
		
		this.file.setLabel("File");
		
		//the open option
		
		this.openFile.setLabel("Open");
		this.openFile.addActionListener(this); //we know it is been clicked
		this.openFile.setShortcut(new MenuShortcut(KeyEvent.VK_0, false));
		this.file.add(this.openFile);
		
		//the save option
		
		this.saveFile.setLabel("Save");
		this.saveFile.addActionListener(this);
		this.saveFile.setShortcut(new MenuShortcut(KeyEvent.VK_S, false));
		this.file.add(this.saveFile);
		
		//the close option
		
		this.closeFile.setLabel("Close");
		this.closeFile.setShortcut(new MenuShortcut(KeyEvent.VK_F4,false)); //CTRL +F4
		this.closeFile.addActionListener(this);
		this.file.add(this.closeFile);
	}
		public void actionPerformed (ActionEvent e) {
			//if the source of the event was the close option
			if(e.getSource() == this.closeFile) {
				this.dispose();
				//if the source of the event was the open opt
			}else if (e.getSource()== this.openFile) {
				JFileChooser open = new JFileChooser(); //open a filechooser;
				int option = open.showOpenDialog(this);
				
				if(option == JFileChooser.APPROVE_OPTION) {
					this.textArea.setText(""); //clearing the text area
					try {
						Scanner scanner = new Scanner(new FileReader(open.getSelectedFile().getPath())); //create a scanner to read the file
						while(scanner.hasNext()) {
							this.textArea.append(scanner.nextLine() + "\n");
						}
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				}
			}else if(e.getSource() == this.saveFile) {
				JFileChooser save = new JFileChooser();// open again a filechooser;
				int option = save.showSaveDialog(this); //similar to the open, but now it's a showSaveDialog()
				if(option == JFileChooser.APPROVE_OPTION) {
					//create a bufferedwriter to write to the file
					try {
						BufferedWriter bf = new BufferedWriter(new FileWriter(save.getSelectedFile().getPath()));
						bf.write(this.textArea.getText()); // writes the content of the textArea to the file
						bf.close();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				}
						
			}
			
		}
		// the main method 
		public static void main(String[]args) {
			NotepadApp notepad = new NotepadApp();
			notepad.setVisible(true);
		}
	}

