import java.util.Scanner;
import java.util.Random;

public class whilenumero {
	public static void main(String[] args) {
	
		double myrand = Math.random() * 3;
		int value = (int)myrand;
		
	System.out.println("Introduce un número entre el 1 y el 3: ");
	Scanner newScanner = new Scanner(System.in);
	
	int num = newScanner.nextInt();
	int intentos = 1;
	
		
		while (num != value ) {
		
				System.out.println("Incorrecto. Intenta de nuevo: ");
				System.out.println(value);
				num = newScanner.nextInt();
			
				intentos++;
			
				if (intentos == 3 && num!= value) {
				System.out.println("Incorrecto. Máximo de intentos permitido alcanzado.");
			
				break;
			}
		}
	
	   
		 if (num == value)   System.out.println("Correcto.");
		 
	
		
	
	newScanner.close();

}
	}
