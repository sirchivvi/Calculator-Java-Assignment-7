# Java Calculator Application

A modular Java-based calculator that supports basic arithmetic and mathematical operations. Each operation is implemented in a separate class with dedicated functions and proper exception handling. This project demonstrates object-oriented programming and clean code principles.

---

## Features

The calculator supports the following operations:

| Operation       | Method/Class                       | Description                                      |
|----------------|-------------------------------------|--------------------------------------------------|
| Addition        | `Addition.performAddition(a, b)`        | Adds two numbers                                 |
| Subtraction     | `Subtraction.performSubtraction(a, b)`  | Subtracts second number from the first           |
| Multiplication  | `Multiplication.performMultiplication(a, b)` | Multiplies two numbers                           |
| Division        | `Division.performDivision(a, b)`        | Divides first number by second (handles divide-by-zero) |
| Square          | `Square.performSquare(a)`               | Calculates the square of a number                |
| Cube            | `Cube.performCube(a)`                   | Calculates the cube of a number                  |
| Square Root     | `SquareRoot.performSquareRoot(a)`       | Calculates the square root (handles negatives)   |

---

## Technologies Used

- Java SE 17 or above
- Command Line Interface (CLI)

---

## File Structure
Calculator/ ├── Addition.java ├── Subtraction.java ├── Multiplication.java ├── Division.java ├── Square.java ├── Cube.java ├── SquareRoot.java ├── CalculatorMain.java └── README.md
## How to Run

1. Compile all `.java` files using:

javac *.java


2. Run the program with:

java CalculatorMain


---

## Exception Handling

- **ArithmeticException** – Handled during division by zero.
- **IllegalArgumentException** – Thrown for square root of negative values.
- **InputMismatchException** – Catches non-numeric user inputs during runtime.

---

## Commit Structure

- Each file has been committed separately.
- Each function has a dedicated commit.
- The README and documentation are committed separately.
- Followed clear commit messages for traceability.

---

## Future Enhancements

- GUI-based interface
- Trigonometric and logarithmic operations
- Unit testing using JUnit

---

## License

This project is intended for academic and educational purposes only.
