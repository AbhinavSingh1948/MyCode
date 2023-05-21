import java.util.Scanner;
public class Aritmetic {

    public static void main(String[] args){

        int a , b;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numbers: ");
        a= sc.nextInt();
        b= sc.nextInt();
        System.out.println("Addition="+(a+b));
        System.out.println("Subtraction=" +(a-b));
        System.out.println("Multiplication="+(a*b));
        System.out.println("Divison="+(a/b));
        System.out.println("Remainder="+(a%b));

    }
}

