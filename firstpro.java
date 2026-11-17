<<<<<<< HEAD
import java.util.Scanner;

public class firstpro {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int age;
        String name;
        float marks;
        char result;
        long total_marks;

        System.out.print("Enter age: ");
        age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter name: ");
        name = sc.nextLine();
         
        System.out.print("Enter marks: ");
        marks = sc.nextFloat();

        System.out.print("Enter grade: ");
        result = sc.next().charAt(0);

        System.out.print("Enter total marks: ");
        total_marks = sc.nextLong();

        System.out.println("\n--- Student Details ---");
        System.out.println("Age: " + age);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + result);
        System.out.println("Total Marks: " + total_marks);

        sc.close();
    }
=======
import java.util.Scanner;

public class firstpro {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int age;
        String name;
        float marks;
        char result;
        long total_marks;

        System.out.print("Enter age: ");
        age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter name: ");
        name = sc.nextLine();
         
        System.out.print("Enter marks: ");
        marks = sc.nextFloat();

        System.out.print("Enter grade: ");
        result = sc.next().charAt(0);

        System.out.print("Enter total marks: ");
        total_marks = sc.nextLong();

        System.out.println("\n--- Student Details ---");
        System.out.println("Age: " + age);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + result);
        System.out.println("Total Marks: " + total_marks);

        sc.close();
    }
>>>>>>> a1abfb7e0329894d9b4e2ef31ebcba24d7719b58
}