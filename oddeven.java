import java.util.Scanner;
public class oddeven {
    public static void main(String[] args){
        int i; 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        i=sc.nextInt();
        if(i%2 == 0)
        {
         System.out.println("the number is even ");
        }
        else
        {
          System.out.println("The number is odd ");
        }

    

    }
    
}
