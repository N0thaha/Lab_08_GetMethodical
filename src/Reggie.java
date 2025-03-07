import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String ssn = SafeInput.getRegExString(scanner, "Enter your SSN (XXX-XX-XXXX)", "^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("SSN accepted: " + ssn);

        String mNumber = SafeInput.getRegExString(scanner, "Enter your UC Student M number (M12345)", "^(M|m)\\d{5}$");
        System.out.println("UC Student M number accepted: " + mNumber);

        String menuChoice = SafeInput.getRegExString(scanner, "Enter a menu choice (O, S, V, Q)", "^[OoSsVvQq]$");
        System.out.println("Menu choice accepted: " + menuChoice);
    }
}