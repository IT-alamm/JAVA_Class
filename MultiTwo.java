import java.util.Scanner;
public class MultiTwo {
    public static int multiTwoNum(int a, int b) {
        
        return (a * b);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Fix: Use Scanner instead of MultiTwo

        System.out.println("Enter First number:");
        int a = sc.nextInt();

        System.out.println("Enter Second number:");
        int b = sc.nextInt();

        int result = multiTwoNum(a, b);
        System.out.println("Multiplication is: " + result);

        // sc.close(); // Good practice to close the scanner
    }
}
