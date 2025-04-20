// Class to perform Addition
public class Addition {
	/**
 	* Adds two numbers.
 	*/
	public static double performAddition(double a, double b) {
    	return a + b;
	}
}


// Class to perform Subtraction
public class Subtraction {
	public static double subtract(double a, double b) {
    	return a - b;
	}
}

// Class to perform Multiplication
public class Multiplication {
	public static double multiply(double a, double b) {
    	return a * b;
	}
}

// Class to perform Division
public class Division {
	public static double divide(double a, double b) throws ArithmeticException {
    	if (b == 0) throw new ArithmeticException("Cannot divide by zero");
    	return a / b;
	}
}

// Class to perform Square
public class Square {
	public static double square(double a) {
    	return a * a;
	}
}

// Class to perform Cube
public class Cube {
	public static double cube(double a) {
    	return a * a * a;
	}
}

// Class to perform Square Root
public class SquareRoot {
	public static double sqrt(double a) throws IllegalArgumentException {
    	if (a < 0) throw new IllegalArgumentException("Cannot find square root of negative number");
    	return Math.sqrt(a);
	}
}
