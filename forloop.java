import java.util.Scanner;
public class forloop{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        for(int i=1;i<=20;i++){
        for(int j=1;j<=10;j++){
            System.out.println(num+ "*" +i+ "=" +(num*i));
        }
        }
    }

}