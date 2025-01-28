import java.util.Scanner;

    public class calculator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            // Input two numbers
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();
    
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();
            // Perform calculations
            double addition = num1 + num2;
            double subtraction = num1 - num2;
            double multiplication = num1 * num2;
            double division = num1 / num2; // Intentional error: Should be num1 / num2
            
    
            // Display results
            System.out.println("Addition: " + addition);
            System.out.println("Subtraction: " + subtraction);
            System.out.println("Multiplication: " + multiplication);
            System.out.println("Division: " + division); // This will not calculate correctly if num2 != num1
    
            scanner.close();
        }
    }
    