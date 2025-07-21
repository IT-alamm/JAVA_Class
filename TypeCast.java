package JAVA_Class;

public class TypeCast {
    public static void main(String[] args) {
        // Q2
        char ch1 = 's';
        int a;
        a = ch1;   //widening
        System.out.println("char  's' int to number : " +a);

        // Q3

        // integer into byte
        int num = 120;
        byte b = (byte)num;  //narrowing
        System.out.println("integer into byte : " +b);

        // integer into short
        
        short c = (short)num;   //narrowing
        System.out.println("integer into short : " +c);


        // integer into long
          
        // long d;
        long d = num;  //narrowing
        System.out.println("integer into long : " + d);

        // integer to float


        float e = num;   //widening
        System.out.println("integer into float : " +e);

        // iteger to double

        double f = num;  //narrowing
        System.out.println("integer into double : " +f);


        // integer to char 

        char g = (char)num;  //widening
        System.out.println("integer into char : " +g);

        //  Q4

        double val = 56.09;
        int val1 = (int)val;  // narrowing
        System.out.println("Double value into intger type  : " +val1);



        // Q5

        char ch2 = 'A';
        short h = (short)ch2;  //widening
        System.out.println("char into short : " +h);


        // Q6

        boolean bool = false;
       

        // Convert boolean to int manually
        int Value = bool ? 1 : 0;
        System.out.println("Boolean value: " + bool);
        System.out.println("Converted int value: " + Value);

    }
    
}
