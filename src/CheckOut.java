import java.util.Scanner;

public class CheckOut {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean again = true;
        double price = 0;

        do {
            price = price + SafeInput.getRangedDouble(scanner, "What is your item price?", 0.5, 10.00);
            again = SafeInput.getYNConfirm(scanner, "Do you have another item? (y/n)");
        } while (again);

        System.out.printf("Your total cost is: $%.2f%n", price);
    }
}
