import java.util.Scanner;

class fibbonic{
    void fibbonicSeries(int n){
        int n1=0,n2=1,n3,cout=n;
        System.out.print(n1+ " "+ n2);
         for(int i=3;i<=n;i++){
             n3=n1+n2;
             n1=n2;
             n2=n3;
             System.out.print(" "+n3);
         }
    }
}


public class FabonacciExample {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter a number:");
        int y;
        y= sc.nextInt();

        fibbonic fb = new fibbonic();
        fb.fibbonicSeries(y);
}
}
