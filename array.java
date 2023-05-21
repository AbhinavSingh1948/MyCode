import java.util.Arrays;
public class array {


    public static void main(String[] args){

        int[] mark = new int[3];
        mark[0] = 98;
        mark[1] = 95;
        mark[2] = 93;
       System.out.println(mark[1]);

        // length in array:
       System.out.println(mark.length);

        // Sort in array:
        System.out.println(mark[0]);
        Arrays.sort(mark);
        System.out.println(mark[0]);

    }
    
}
