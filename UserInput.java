import java.util.Scanner;

public class UserInput {
    
    public static void main(String[] args) {
            
          Scanner sc = new Scanner(System.in);

          System.out.println("Starrt main");
          System.out.println("Enter a number : ");
          int a = sc.nextInt();

          System.out.println("Number is  : "  + a);


          System.out.println("Ebter a byte no .");
          byte b = sc.nextByte();
          System.out.println("byte no. : " + b);

          System.out.println("Ebter a short no .");
          Short c = sc.nextShort();
          System.out.println("short no. : " + c);

          System.out.println("Ebter a Long  no .");
          long d = sc.nextLong();
          System.out.println("Long no. : " + d);

          System.out.println("Ebter a Float  no .");
          float e = sc.nextFloat();
          System.out.println("float no. : " + e);

          System.out.println("Ebter a double  no .");
          double f = sc.nextDouble();
          System.out.println("Double  no. : " + f);


          System.out.println("Ebter a string   .");
          String g = sc.next();
          System.out.println("string is  : " + g);









        
    }
}
