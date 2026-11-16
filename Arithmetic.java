import java.util.Scanner;

public class Arithmetic {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b;

        System.out.println("================================");
        System.out.println("   JAVA ARITHMETIC OPERATORS");
        System.out.println("================================");

        // Taking input from user
        System.out.print("Enter first number: ");
        a = sc.nextInt();

        System.out.print("Enter second number: ");
        b = sc.nextInt();

        // Addition
        System.out.println("\n--- ADDITION ---");
        System.out.println(a + " + " + b + " = " + (a + b));

        // Subtraction
        System.out.println("\n--- SUBTRACTION ---");
        System.out.println(a + " - " + b + " = " + (a - b));

        // Multiplication
        System.out.println("\n--- MULTIPLICATION ---");
        System.out.println(a + " * " + b + " = " + (a * b));

        // Division
        System.out.println("\n--- DIVISION ---");
        if (b != 0) {
            System.out.println(a + " / " + b + " = " + (a / b));
        } else {
            System.out.println("Division by zero is not possible");
        }

        // Modulus
        System.out.println("\n--- MODULUS ---");
        if (b != 0) {
            System.out.println(a + " % " + b + " = " + (a % b));
        } else {
            System.out.println("Modulus by zero is not possible");
        }
    }
}