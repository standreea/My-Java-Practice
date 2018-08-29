import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	double firstnum;
	double secondnum;
	String operations;
	String answer;
	double result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 18));
		frame.setBounds(100, 100, 290, 430);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(12, 13, 240, 40);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textField.getText() + btn7.getText();
				textField.setText(EnterNumber);
				
			}
		 });
		
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn7.setBounds(12, 66, 50, 50);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textField.getText() + btn8.getText();
				textField.setText(EnterNumber);
				
			}
		});
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn8.setBounds(78, 66, 50, 50);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textField.getText() + btn9.getText();
				textField.setText(EnterNumber);
				
			}
		});
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn9.setLocation(140, 66);
		btn9.setSize(50, 50);
		frame.getContentPane().add(btn9);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "+";
						
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnPlus.setBounds(202, 65, 50, 50);
		frame.getContentPane().add(btnPlus);
		
		//--------------Row 2---------------
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textField.getText()+btn4.getText();
				textField.setText(EnterNumber);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn4.setBounds(12, 128, 50, 50);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textField.getText() + btn5.getText();
				textField.setText(EnterNumber);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn5.setBounds(78, 129, 50, 50);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textField.getText() + btn6.getText();
				textField.setText(EnterNumber);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn6.setLocation(140, 129);
		btn6.setSize(50, 50);
		frame.getContentPane().add(btn6);
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "-";
			}
		});
		btnMinus.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnMinus.setBounds(202, 128, 50, 50);
		frame.getContentPane().add(btnMinus);
		
		//--------------Row 3---------------
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textField.getText() + btn1.getText();
				textField.setText(EnterNumber);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn1.setBounds(12, 189, 50, 50);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textField.getText() + btn2.getText();
				textField.setText(EnterNumber);
				
			}
		});
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn2.setBounds(78, 189, 50, 50);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textField.getText() + btn3.getText();
				textField.setText(EnterNumber);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn3.setLocation(140, 189);
		btn3.setSize(50, 50);
		frame.getContentPane().add(btn3);
		
		JButton btnMultiply = new JButton("*");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "*";
			}
		});
		btnMultiply.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnMultiply.setBounds(202, 189, 50, 50);
		frame.getContentPane().add(btnMultiply);
		
		//--------------Row 3---------------
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textField.getText() + btn0.getText();
				textField.setText(EnterNumber);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn0.setBounds(12, 252, 50, 50);
		frame.getContentPane().add(btn0);
		
		JButton btnDot = new JButton(".");
		btnDot.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnDot.setBounds(78, 252, 50, 50);
		frame.getContentPane().add(btnDot);
		
		JButton btnPlusMinus = new JButton("+-");
		btnPlusMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				ops = ops * (-1);
				textField.setText(String.valueOf(ops));
			}
		});
		btnPlusMinus.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnPlusMinus.setLocation(140, 252);
		btnPlusMinus.setSize(60, 50);
		frame.getContentPane().add(btnPlusMinus);
		
		JButton btnEgal = new JButton("=");
		btnEgal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String answer;
				secondnum = Double.parseDouble(textField.getText());
				
				if(operations == "+") {
					result = firstnum + secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
					
				}else if(operations == "-") {
					result = firstnum - secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
					
				}else if(operations == "/") {
					result = firstnum / secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
					
				}else if (operations == "*") {
					result = firstnum * secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				
				}else if (operations == "%") {
					result = firstnum % secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
			}
		}
		);
		btnEgal.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnEgal.setBounds(202, 252, 50, 50);
		frame.getContentPane().add(btnEgal);
		
		//------------------------Row 5-------------------
		
		
		JButton btnDelete = new JButton("<-");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String delete = null;
				if(textField.getText().length() > 0) {
					StringBuilder stb = new StringBuilder(textField.getText());
					stb.deleteCharAt(textField.getText().length()-1);
					delete = stb.toString();
					textField.setText(delete);
					
				}
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnDelete.setBounds(12, 315, 54, 50);
		frame.getContentPane().add(btnDelete);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnClear.setBounds(78, 315, 50, 50);
		frame.getContentPane().add(btnClear);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "/";
			}
		});
		btnDiv.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnDiv.setLocation(140, 315);
		btnDiv.setSize(60, 50);
		frame.getContentPane().add(btnDiv);
		
		JButton btnLaSuta = new JButton("%");
		btnLaSuta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "%";
			}
		});
		btnLaSuta.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnLaSuta.setBounds(202, 315, 58, 50);
		frame.getContentPane().add(btnLaSuta);
	}
}
	
	
