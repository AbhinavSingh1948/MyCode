 class overloading {
    void add() 
    {
      int a=10 , b= 20 , c;
      c=a+b;
      System.out.println(c);
    }
    void add(int x, int y) //more than 1 parameter
    {
        int c;
        c=x+y;
        System.out.println(c);
    
   }
   void add(String  x, int y){ //more than 1 parameter
     String c;
    c=x+y;
    System.out.println(c);
}
public static void main(String[] args){
    overloading r=new overloading();
    r.add(); 
    r.add(100,200); 
    r.add("21BCA1948  ",803);
}
}
