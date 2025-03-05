import java.util.Scanner;
public class DevTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String zipCode = SafeInput.getRegExString(scanner, "Enter a 5-digit ZIP code", "\\d{5}");
        System.out.println("You entered: " + zipCode);
    }
}