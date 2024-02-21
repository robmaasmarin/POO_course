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
			
			do {
				
				System.out.println("Invalid name. Please, try again: ");
				name = myScanner.nextLine();
				
			}
			
			while (!name.matches("[a-zA-Z_]+"));
		    
		}
       
       
		
		System.out.println("Hello " + name + "!");
        
		
        System.out.println("Enter a number: ");
        int firstNumber = myScanner.nextInt();
        System.out.println("Enter another number: ");

        int secondNumber = myScanner.nextInt();

        /*while (secondNumber <= firstNumber) {
            int resta = firstNumber - secondNumber;
            System.out.println("Resultado =  " + resta);
                  
               }*/
        
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
        System.out.println("Resultado =  " + resta);
        myScanner.close();
    }
}