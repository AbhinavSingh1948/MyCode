public class main {
    public static void main(String[] args) {
       System.out.println("hello java");
       System.out.print("java first program");
// primitive data types:
        byte age =30;
        int phone = 201764908;
        long phone2 =235472389347L;
        float pi = 3.14F;
        char letter ='@';
        boolean isadult = true;

        // Non primitive type
        String name ="Abhinav";
        System.out.println (name.length());

        //concatenate:(Adding of 2 string)
        String name1 = "Abhinav";
        String name2 ="Singh";
        String name3 = name1 + " and "+ name2;
        System.out.println(name3);

         //charAt
         String nameString=  "Abhinav";
         System.out.println(name.charAt(1));

         //replace
         String nameX  ="Appu";
         String nameZ= nameX.replace('A','b');
         System.out.println(nameZ);

         //substrings
         String nameC ="Abhi and Ashu ";
         System.out.println(nameC.substring(0,4));
    
    }
}
