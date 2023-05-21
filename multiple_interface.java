interface Abhay {
    void eat();
 }
 interface Rohit {
    void travel();
 }
 class BCA8 implements Abhay, Rohit {
    public void eat() {
       System.out.println("Abhay is eating");
    }
    public void travel() {
       System.out.println("Rohit is travelling");
    }
 }
 public class multiple_interface {
    public static void main(String args[]) {
       BCA8 X = new BCA8();
       X.eat();
       X.travel();
    }
 }

