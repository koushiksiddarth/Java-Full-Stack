import java.util.Scanner;
public class bitwise{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num=sc.nextInt();
        int koushik=sc.nextInt();
        System.out.println("the number is: "+(num&koushik));
        System.out.println("the number is: "+(num^koushik));
        System.out.println("the number is: "+(num|koushik));
        System.out.println("the number is: "+(~num));
        System.out.println("the number is: "+(num<<koushik));
        System.out.println("the number is: "+(num>>koushik));
    sc.close();

    }
}