import java.util.Scanner;
public class BirthDateTime {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int year = SafeInput.getRangedInt(scanner, "Enter birth year", 1950, 2015);
        int month = SafeInput.getRangedInt(scanner, "Enter birth month", 1, 12);

        int daysInMonth;
        switch (month) {
            case 4: case 6: case 9: case 11:
                daysInMonth = 30;
                break;
            case 2:
                daysInMonth = 29;
                break;
            default:
                daysInMonth = 31;
        }

        int day = SafeInput.getRangedInt(scanner, "Enter birth day", 1, daysInMonth);
        int hours = SafeInput.getRangedInt(scanner, "Enter birth hour", 1, 24);
        int minutes = SafeInput.getRangedInt(scanner, "Enter birth minute", 1, 59);

        System.out.println("\nYou were born on: " + month + "/" + day + "/" + year +
                " at " + hours + ":" + String.format("%02d", minutes));
    }
}

