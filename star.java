public class star{
    public static void main (String[] args){
        int n=0;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
                n++;
            }
            System.out.println(" ");
        }
        System.out.println("stars: "+n);
    }
}