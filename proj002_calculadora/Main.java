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
                System.out.println("Result: " + result);
                break;
            case "-":
                result = calculator.subtract();
                System.out.println("Result: " + result);
                break;
            case "/":
                result = calculator.divide();
                System.out.println("Result: " + result);
                break;
            case "*":
                result = calculator.multiply();
                System.out.println("Result: " + result);
                break;
        }


    }

    private static float setNumber(Scanner scanner){
        float num = 0;
        boolean isValid = false;
        do {
            try {
                System.out.println("Type a float value: ");
                num = scanner.nextFloat();
                isValid = true;
                break;
            } catch (InputMismatchException e) {
                System.out.println("ERROR: The value inserted is not a valid float.");
                isValid = false;
                consumeInvalidInput(scanner);
            }
        } while (isValid == false);
        return num;
    }

    private static String setOperator(Scanner scanner){
        String operator = "";
        boolean isValid = false;
        do {
            try {
                System.out.println("Type an operator (+; -; /; *): ");
                operator = scanner.next();
                if (operator.equals("+") || operator.equals("-") || operator.equals("/") || operator.equals("*")){
                    isValid = true;
                    break;
                } else {
                    System.out.println("ERROR: The value inserted is not a valid operator.");
                    isValid = false;
                    consumeInvalidInput(scanner);
                }
            } catch (InputMismatchException e) {
                System.out.println("ERROR: The value inserted is not a valid operator.");
                isValid = false;
                consumeInvalidInput(scanner);
            }
        } while (isValid == false);
        return operator;
    }

    private static void consumeInvalidInput(Scanner scanner){
        if (scanner.hasNextLine()) {
            scanner.nextLine(); // if there is a value in the input buffer, consumes it so the input buffer becomes empty again
        }
    }

}