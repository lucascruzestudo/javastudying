import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int value = 0;
        boolean valid = false;
        do {
            try {
                System.out.println("Type an int value: ");
                value = s.nextInt();
                valid = true;
                break;
            } catch (Exception e) {
                System.out.println("ERROR: The value inserted is not valid, provide an int value.");
                valid = false;
                s.next(); 
            }
        } while (valid == false);
        s.close();
        System.out.println("The value provided by the user was: " + value);
    }
}