import java.util.Scanner;

public class l�xa42 {

private static Scanner input;
public static void main(String[] args) {
		
		input = new Scanner(System.in);
		
		double intag = input.nextDouble();
		String in = input.next();
		String ord = input.next();
		char c = input.next().charAt(0);
		String word = input.next();
		
		System.out.println(Naruto(intag));
		System.out.println(Sasuke(in));
		System.out.println(Sakura(ord, c));
		System.out.println(Kakashi(word));
	}
	public static double Naruto(double intag) {
		
		intag = intag * intag * intag;
		intag = 4 * intag * 3.14 / 3;
		return intag;
	}
	public static String Sasuke(String in) {
		String str = "";
		
		for (int i = in.length() - 1; i >= 0; i--) {
			str += in.charAt(i);
		}
		return str;
	}
	public static int Sakura(String ord, char c) {
		
		int antal = 0;
		
		for (int i = 0; i < ord.length(); i++) {
			
			if (ord.toLowerCase().charAt(i) == (c)) {
				antal = antal + 1;
			}
		}
		return antal;
	}
	public static String Kakashi(String word) {
		String nytt = "";
		
		for (int i = 0; i < word.length(); i++) {
			switch (word.toLowerCase().charAt(i)) {
			case 'b':
			case 'c':
			case 'd':
			case 'f':
			case 'g':
			case 'h':
			case 'j':
			case 'k':
			case 'l':
			case 'm':
			case 'n':
			case 'p':
			case 'q':
			case 'r':
			case 's':
			case 't':
			case 'v':
			case 'w':
			case 'x':
			case 'z':
			
		nytt += word.charAt(i) + "o" + word.charAt(i);
			}
			
			switch (word.toLowerCase().charAt(i)) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'y':
			case '�':
			case '�':
			case '�':
			case ' ':
		nytt += word.charAt(i);
			}
			
			}
		return  nytt;
		}
	}
	
