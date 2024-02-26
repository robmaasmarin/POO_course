import java.util.Scanner;

public class onlynumbers {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int num1;
        System.out.print("Enter number 1: ");
        while (true)
            try {
                num1 = Integer.parseInt(kb.nextLine());
                System.out.println(num1);
                break;
            } catch (NumberFormatException nfe) {
                System.out.print("Try again: ");
            }
    }
}
