import java.util.Scanner;
//import java.util.InputMismatchException;


public class myscanner {
	
	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("Hola, introduce un número: ");
		int num1;
		int num2;
		
		do {
			if (myScanner.hasNextInt()) {
				num1 = myScanner.nextInt();
				
				break;
				}
		
			else {
				myScanner.next();
				System.out.println("Invalid format. Try again: ");
				
			}	
		
		} while (true);
		
			
				
		System.out.println("Hola, introduce otro número: ");
		//num2 = myScanner.nextInt();
		
		do {
			if (myScanner.hasNextInt()) {
				num2 = myScanner.nextInt();
				
				break;
				}
		
			else {
				myScanner.next();
				System.out.println("Invalid format. Try again: ");
				
			}	
		
		} while (true);
		
		
		int result = num1 + num2;
		
		System.out.println("Result " + result);
		
		
				
	}

}
