import java.util.*;
public class conditin2{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Integers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>18){
            System.out.println("Not Eligible for voting");
        }
        else if(b>18){
            System.out.println("Eligible for voting");
        }
        else{
            System.out.println("Not eligible for voting");
        }

    }
}