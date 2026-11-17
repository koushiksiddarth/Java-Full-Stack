import java.util.Scanner;
public class switchcase3{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int dept=sc.nextInt();
        System.out.println("Enter a department number(1-6): ");
        switch(dept){
            case 1:
                System.out.println("CSE");
                break;
            case 2:
                System.out.println("ECE");
                break;
            case 3:
                System.out.println("EEE");
                break;
            case 4:
                System.out.println("MECH");
                break;
            case 5:
                System.out.println("CIVIL");
                break;
            case 6:
                System.out.println("CAI");
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}