 class A {
    int a; String b;
    A(){
        a=10;
        b="Abhi";
        System.out.println(a+" "+b);
    }
    A ( A ref){
        a=ref.a;
        b=ref.b;
        System.out.println(a+" "+b);
    }

    
}
class copyconstructor{
    public static void main(String[] args){
        A r=new A();
        A r2=new A(r);

    }
}
