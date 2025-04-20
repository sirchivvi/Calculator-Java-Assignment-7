/*
Name: Akhil Chivukula
PRN: [Your PRN]
Batch: AIML 2023-27
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	int choice;

    	do {
        	// Display Menu
        	System.out.println("\n===== Calculator Menu =====");
        	System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
        	System.out.println("5. Square\n6. Cube\n7. Square Root\n8. Exit");
        	System.out.print("Enter your choice: ");

        	try {
            	choice = scanner.nextInt();

            	if (choice >= 1 && choice <= 4) {
                	System.out.print("Enter first number: ");
                	double a = scanner.nextDouble();
                	System.out.print("Enter second number: ");
                	double b = scanner.nextDouble();

                	switch (choice) {
                    	case 1 -> System.out.println("Result: " + Addition.performAddition(a, b));
                    	case 2 -> System.out.println("Result: " + Subtraction.performSubtraction(a, b));
                    	case 3 -> System.out.println("Result: " + Multiplication.performMultiplication(a, b));
                    	case 4 -> {
                        	try {
                            	System.out.println("Result: " + Division.performDivision(a, b));
                        	} catch (ArithmeticException e) {
                            	System.out.println("Error: " + e.getMessage());
                        	}
                    	}
                	}

            	} else if (choice >= 5 && choice <= 7) {
                	System.out.print("Enter a number: ");
                	double num = scanner.nextDouble();

                	switch (choice) {
                    	case 5 -> System.out.println("Square: " + Square.performSquare(num));
                    	case 6 -> System.out.println("Cube: " + Cube.performCube(num));
                    	case 7 -> {
                        	try {
                            	System.out.println("Square Root: " + SquareRoot.performSquareRoot(num));
                        	} catch (IllegalArgumentException e) {
                            	System.out.println("Error: " + e.getMessage());
                        	}
                    	}
                	}
            	} else if (choice == 8) {
                	System.out.println("Exiting Calculator...");
            	} else {
                	System.out.println("Invalid choice.");
            	}

        	} catch (InputMismatchException e) {
            	System.out.println("Invalid input. Please enter numbers only.");
            	scanner.next(); // Clear scanner buffer
            	choice = 0;
        	}

    	} while (choice != 8);

    	scanner.close();
	}
}
