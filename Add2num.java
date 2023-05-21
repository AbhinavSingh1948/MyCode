import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

import java.util.Scanner;
public class Add2num {
    public static void main(String[] args){
        int a;
        int b;
        int sum;
        System.out.println("enter the number: ");
        Scanner sc = new Scanner(System.in);
       a=sc.nextInt();
       b=sc.nextInt();
       sum = a+b;
       System.out.println( "Addition will be:" +  sum);
    }
   
}
