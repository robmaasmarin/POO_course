import java.util.Scanner;

public class objects {
	int hidratos;
	int sugar;
	
	 static void myMethod(int param) {
	    if (param > 0 && param < 10 )
	    	{System.out.println("Insuline units to inyect: 1");
	    	}
	    else {
	    	System.out.println("Insuline units to inyect: 2");
	    }
	  }
	
	
	public static void main(String[] args) {
		
		
		
		objects carrot = new objects();
		carrot.hidratos = 7;
		carrot.sugar = 2;
		
		objects potato = new objects();
		potato.hidratos = 25;
		potato.sugar = 7;
		
		objects lentills = new objects();
		lentills.hidratos = 15;
		lentills.sugar = 3;
		
		objects chips = new objects();
		chips.hidratos = 50;
		chips.sugar = 35;
		
		System.out.println("Select an element: \n"  + "1. Carrot \n" + "2. Potato \n"+ "3. Lentills \n"+ "4. Chips \n");
		
		Scanner foodScanner = new Scanner(System.in);
		
		int num = foodScanner.nextInt();
		
		System.out.println("Enter quantity(in grams): ");
		
		int grams = foodScanner.nextInt();
		
		int hidratostotal;
		int azucarestotal;
		int insulina;
		
		
		
		if (num == 1) {
			hidratostotal = (carrot.hidratos * grams) / 100;
			System.out.println("Alimento: Carrot\n"  + "Hidratos ingeridos: " + hidratostotal);
			myMethod(hidratostotal);
		}
		else if (num == 2) {
			hidratostotal = (potato.hidratos * grams) / 100;
			System.out.println("Alimento: Potato\n"  + "Hidratos ingeridos: " + hidratostotal);
			myMethod(hidratostotal);
		}
		else if (num == 3) {
			hidratostotal = (lentills.hidratos * grams) / 100;
			System.out.println("Alimento: Lentills\n"  + "Hidratos ingeridos: " + hidratostotal);
			myMethod(hidratostotal);
		}
		
		else if (num == 4) {
			hidratostotal = (chips.hidratos * grams) / 100;
			System.out.println("Alimento: Chips\n"  + "Hidratos ingeridos: " + hidratostotal);
			myMethod(hidratostotal);
			
		}
		else {
			System.out.println("Product not found.");
		}
		
		
	}
	
}
