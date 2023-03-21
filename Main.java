import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = 0;
        boolean isValid = false;
        do {
            try {
                System.out.println("Type an int value: ");
                value = scanner.nextInt();
                isValid = true;
                break;
            } catch (InputMismatchException e) {
                System.out.println("ERROR: The value inserted is not a valid integer. Please provide an integer value.");
                isValid = false;
                consumeInvalidInput(scanner);
            }
        } while (isValid == false);
        scanner.close();
        System.out.println("The value provided by the user was: " + value);
    }

    private static void consumeInvalidInput(Scanner scanner){
        if (scanner.hasNext()) {
            scanner.next(); // if there is a value in the input buffer, consumes it so the input buffer becomes empty again
        }
    }

}