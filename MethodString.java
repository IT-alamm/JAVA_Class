import java.util.Scanner;

public class MethodString {
   public MethodString() {
   }

   public static String lastCharOfStr(String var0) {
      char var1 = var0.charAt(var0.length() - 1);
      return String.valueOf(var1);
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("Enter a string: ");
      String var2 = var1.next();
      System.out.println("String is: " + var2);
      System.out.println("Last character: " + lastCharOfStr(var2));
   }
}
