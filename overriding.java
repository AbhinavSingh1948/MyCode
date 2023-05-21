 class shape {
    void draw(){
        System.out.println("cant have any shape");
    }
    
}
class square extends shape {  // without using constructor (extends) we can not access overriding method.
    @Override
    void draw(){
        System.out.println("Square ");
    }
}
public class overriding{
    public static void main(String[] args){
        shape r= new square(); // reference of super class and object of sub class.
        r.draw();
    }
}
