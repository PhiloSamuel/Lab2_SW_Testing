import java.util.Scanner;

public class even_odd {
    public static void main(String[] args) {
        System.out.println("please enter a number to check if it's even or odd");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        System.out.println(evenOdd(x));

    }
public static boolean evenOdd(int i) {
        if (i % 2 == 0) {
            System.out.println("The number is EVEN");
            return true;
        } else
            System.out.println("The number is ODD");
        return false;
    }
}
