import java.util.Scanner;
public class FavNumbers {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int favInt = SafeInput.getInt(scanner, "What is your favorite integer?");
        double favDouble = SafeInput.getDouble(scanner, "What is your favorite double");

        System.out.println("You favorite integer is " + favInt + " and your favorite double is " + favDouble);
    }
}

