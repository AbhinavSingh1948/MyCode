class student {
    String name;
    int rollnumber;
    int marks;
    void input()
    {
        System.out.println("The details of student is:");
    }
}
    class simple_inheritance extends student{
        void disp()
        {
            name="Abhinav"; rollnumber=1948; marks=87;
            System.out.println(name+" "+rollnumber+" "+marks);
        }
    
        public static void main(String[] args)
            {
            simple_inheritance r=new simple_inheritance();
               r.input();
               r.disp();
            }  
        }      
      
    