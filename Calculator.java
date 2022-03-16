import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter first operand: ");
        double numFirst = scnr.nextDouble();
        System.out.print("Enter second operand: ");
        double numSecond = scnr.nextDouble();
        System.out.println();
        System.out.println("Calculator Menu");
        System.out.println("---------------");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println();
        System.out.print("Which operation do you want to perform? ");
        int numOption = scnr.nextInt(); //user input for the operation they want to perfom (1-4)
        double output = 0.0; //declared and initialized at 0 for the output that will occur in the if statements
        if (numOption == 1) { //addition
            output = numFirst + numSecond;
            System.out.println("The result of the operation is " + output + ". Goodbye! ");
        }
        else if (numOption == 2) { //subtraction
            output = numFirst - numSecond;
            System.out.println("The result of the operation is " + output + ". Goodbye! ");
        }
        else if (numOption == 3) { //multiplication
            output = numFirst * numSecond;
            System.out.println("The result of the operation is " + output + ". Goodbye! ");
        }
        else if (numOption == 4) { //division
            output = numFirst / numSecond;
            System.out.println("The result of the operation is " + output + ". Goodbye! ");
        }
        else { //anything other than 1-4 is an error
            System.out.println();
            System.out.println("Error: Invalid selection! Terminating program.");
        }

    }
}
// adding a comment for Lab 6
