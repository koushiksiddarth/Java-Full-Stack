public class star2{
    public static void main (String[] args){
        int n=0;
        for(int i=5;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
                n++;
            }
            System.out.println(" ");
        }
        System.out.println("stars: "+n);
    }
}