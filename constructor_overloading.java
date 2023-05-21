class A {
    int a; double b; String c;
   A(){
    a=10; b=12.22; c="Abhinav";
    System.out.println(a+" "+b+" "+c);
   }
   A(int x){
     a=x;
   }
   A(double y, String z){
    b=y; c=z;
   }

}
class constructor_overloading{
    public static void main(String[] args){
        A r=new A();
        A r2=new A(10);
        A r3=new A(12.22,"Abhinav");
        System.out.println(r.a+" "+r.b+" "+r.c);
        System.out.println(r2.a);
        System.out.println(r3.b+" "+r3.c);

    } 
}
