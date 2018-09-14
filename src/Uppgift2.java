import java.util.Scanner;

public class Uppgift2 {

		public static void main(String[] args) {
		
				Scanner input = new Scanner(System.in);	

				// Läs in tal 1
				int tal1 = input.nextInt();
				int min = tal1;
				int max = tal1;
		
				// Läs in tal 2
				int tal2 = input.nextInt();
				if (tal2 > max) {
					max = tal2;
				}
				if (tal2 < min) {
				min = tal2;
			}	
	
	

}
