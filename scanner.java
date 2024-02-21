import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        System.out.println("Welcome to this Java application");

        Scanner myScanner = new Scanner(System.in);
        
        // Name
       System.out.println("Enter your Name: ");
       String name = myScanner.nextLine();
       
       	// Evitar que el usuario introduzca números en el nombre
       if (!name.matches("[a-zA-Z_]+")) {
    	// si introduce algún carácter no aceptado vuelve a pedir el nombre	
			do {
				System.out.println("Invalid name. Please, try again: ");
				name = myScanner.nextLine();
						}
		while (!name.matches("[a-zA-Z_]+"));
		  }
              		
		System.out.println("Hello " + name + "!");
        
		//Pedimos 2 números para hacer posteriormente la resta 
        System.out.println("Enter a number: ");
        int firstNumber;
        //No permitir ingresar letras o símbolos en lugar de números
        do {
            if (myScanner.hasNextInt()) {
				firstNumber = myScanner.nextInt();
				
				break;
				}
		
			else {
				myScanner.next();
				System.out.println("Invalid format. Try again: ");
				
			}
        } while(true);


        System.out.println("Enter another number: ");

        int secondNumber;

        do {
            if (myScanner.hasNextInt()) {
				secondNumber = myScanner.nextInt();
				
				break;
				}
		
			else {
				myScanner.next();
				System.out.println("Invalid format. Try again: ");
				
			}
        } while(true);
      
      
        // en caso de que el segundo valor sea superior al primero solicitamos de nuevo los números 
        if (secondNumber > firstNumber) {
        
        do {
            System.out.println("Sorry, invalid numbers. Please enter a new number: ");
            firstNumber = myScanner.nextInt();
            System.out.println("Enter another number: ");
            secondNumber = myScanner.nextInt();
            continue;
            
        } while (secondNumber > firstNumber );
        }
                
        int resta = firstNumber - secondNumber;
        
        System.out.println("Result =  " + resta);
        //System.out.println(secondNumber.getClass().getSimpleName();
        myScanner.close();
        //test
    }
}