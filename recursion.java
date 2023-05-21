public class recursion {
    public static void main(String[] args){
     recursion sc =new recursion();
     int a=sc.sum(10);
     System.out.println("Sum of natural number:" +a);


    }
    int sum(int b){

        if(b>0){
            return b+sum(b-1);

        }
        else{
            return 0;
        }
    }
    
}
