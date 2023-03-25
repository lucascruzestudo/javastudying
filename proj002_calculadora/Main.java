import java.util.Scanner;
import java.util.InputMismatchException;


public class Main {
    public static void main(String[] args){
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        float num1 = setNumber(scanner);
        System.out.println("First number set: " + num1);
        calculator.setNum1(num1);
        float num2 = setNumber(scanner);
        System.out.println("Second number set: " + num2);
        calculator.setNum2(num2);
        String operator = setOperator(scanner);
        System.out.println("Operator set: " + operator);
        scanner.close();
        float result = 0;
        
        switch (operator){
            case "+":
                result = calculator.add();
                break;
            case "-":
                result = calculator.subtract();
                break;
            case "/":
                result = calculator.divide();
                break;
            case "*":
                result = calculator.multiply();
                break;
        }
        
        System.out.println("Result: " + result);

    }

    private static float setNumber(Scanner scanner){
        float num = 0;
        boolean isValid = false;
        do {
            try {
                System.out.println("Type a float value: ");
                num = scanner.nextFloat();
                isValid = true;
            } catch (InputMismatchException e) {
                System.out.println("ERROR: The value inserted is not a valid float.");
                consumeInvalidInput(scanner);
            }
        } while (!isValid);
        return num;
    }

    private static String setOperator(Scanner scanner){
        String operator = "";
        boolean isValid = false;
        do {
            try {
                System.out.println("Type an operator (+; -; /; *): ");
                operator = scanner.next();
                if (!operator.matches("[+\\-*/]")) {
                    System.out.println("ERROR: The value inserted is not a valid operator.");
                    consumeInvalidInput(scanner);
                } else {
                    isValid = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("ERROR: The value inserted is not a valid operator.");
                consumeInvalidInput(scanner);
            }
        } while (!isValid);
        return operator;
    }

    private static void consumeInvalidInput(Scanner scanner){
        if (scanner.hasNextLine()) {
            scanner.nextLine(); // CLEAR INPUT BUFFER
        }
    }

}
