import java.io.IOException;
import java.util.Scanner;



import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Horoscop {
	public static void main (String [] args) {
	Scanner scanner = new Scanner(System.in);
			System.out.println("Pick your sign from the list below, entering the corresponding number");
			System.out.printf("%n 1 for Aries %n 2 for Taurus %n 3 for Gemini %n 4 for Cancer %n 5 for Leo %n 6 for Virgo %n 7 for Libra %n 9 for Sagittarius %n 10 for Capricorn %n 11 for Aquarius %n 12 for Piscies"); 
		int number = scanner.nextInt();
			scanner.close();
			switch(number) {
			case 1 : afiseazaBerbec();
					break;
			case 2 : afiseazaTaur();
					break;
			case 3 : afiseazaGemeni();
					break;
			case 4 : afiseazaRac();
					break;
			case 5 : afiseazaLeu();
					break;
			case 6 : afiseazaFecioara();
					break;
			case 7 : afiseazaBalanta();
					break;
			case 8 : afiseazaScorpion();
					break;
			case 9: afiseazaSagetator();
					break;
			case 10: afiseazaCapricorn();
					break;
			case 11: afiseazaVarsator();
					break;
			case 12: afiseazaPesti();
					break;
					
			}
	}
	public static void afiseazaBerbec() {
		String url = "https://www.astrocafe.ro/zodia-berbec";
		Document document = null;
		try {
			document =Jsoup.connect(url).get();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Elements paragraph = document.select("p");
		Element p;
		Element firstParagraph = paragraph.first();
		p = firstParagraph;
			System.out.println(p);
		
		
	}
	public static void afiseazaTaur() {
		String url = "https://www.astrocafe.ro/zodia-taur";
		Document document = null;
		try {
			document =Jsoup.connect(url).get();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Elements paragraph = document.select("p");
		Element p;
		Element firstParagraph = paragraph.first();
		p = firstParagraph;
			System.out.println(p);
			
	}
	public static void afiseazaGemeni() {
		String url = "https://www.astrocafe.ro/zodia-gemeni";
		Document document = null;
		try {
			document =Jsoup.connect(url).get();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Elements paragraph = document.select("p");
		Element p;
		Element firstParagraph = paragraph.first();
		p = firstParagraph;
			System.out.println(p);
			
	}
	public static void afiseazaRac() {
		String url = "https://www.astrocafe.ro/zodia-rac";
		Document document = null;
		try {
			document =Jsoup.connect(url).get();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Elements paragraph = document.select("p");
		Element p;
		Element firstParagraph = paragraph.first();
		p = firstParagraph;
			System.out.println(p);
			
	}
	public static void afiseazaLeu() {
		String url = "https://www.astrocafe.ro/zodia-leu";
		Document document = null;
		try {
			document =Jsoup.connect(url).get();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Elements paragraph = document.select("p");
		Element p;
		Element firstParagraph = paragraph.first();
		p = firstParagraph;
			System.out.println(p);
			
	}
	public static void afiseazaFecioara() {
		String url = "https://www.astrocafe.ro/zodia-fecioara";
		Document document = null;
		try {
			document =Jsoup.connect(url).get();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Elements paragraph = document.select("p");
		Element p;
		Element firstParagraph = paragraph.first();
		p = firstParagraph;
			System.out.println(p);
			
	}
	public static void afiseazaBalanta() {
		String url = "https://www.astrocafe.ro/zodia-balanta";
		Document document = null;
		try {
			document =Jsoup.connect(url).get();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Elements paragraph = document.select("p");
		Element p;
		Element firstParagraph = paragraph.first();
		p = firstParagraph;
			System.out.println(p);
			
	}
	public static void afiseazaScorpion() {
		String url = "https://www.astrocafe.ro/zodia-scorpion";
		Document document = null;
		try {
			document =Jsoup.connect(url).get();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Elements paragraph = document.select("p");
		Element p;
		Element firstParagraph = paragraph.first();
		p = firstParagraph;
			System.out.println(p);
			
	}
	public static void afiseazaSagetator() {
		String url = "https://www.astrocafe.ro/zodia-sagetator";
		Document document = null;
		try {
			document =Jsoup.connect(url).get();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Elements paragraph = document.select("p");
		Element p;
		Element firstParagraph = paragraph.first();
		p = firstParagraph;
			System.out.println(p);
			
	}
	public static void afiseazaCapricorn() {
		String url = "https://www.astrocafe.ro/zodia-capricorn";
		Document document = null;
		try {
			document =Jsoup.connect(url).get();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Elements paragraph = document.select("p");
		Element p;
		Element firstParagraph = paragraph.first();
		p = firstParagraph;
			System.out.println(p);
			
	}
	public static void afiseazaVarsator() {
		String url = "https://www.astrocafe.ro/zodia-varsator";
		Document document = null;
		try {
			document =Jsoup.connect(url).get();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Elements paragraph = document.select("p");
		Element p;
		Element firstParagraph = paragraph.first();
		p = firstParagraph;
			System.out.println(p);
			
	}
	public static void afiseazaPesti() {
		String url = "https://www.astrocafe.ro/zodia-pesti";
		Document document = null;
		try {
			document =Jsoup.connect(url).get();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Elements paragraph = document.select("p");
		Element p;
		Element firstParagraph = paragraph.first();
		p = firstParagraph;
			System.out.println(p);
			
	}
	
}

