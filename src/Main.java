import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c, result;

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the first number: ");
        a = input.nextInt();
        System.out.print("Please enter the second number: ");
        b = input.nextInt();
        System.out.print("Please enter the third number: ");
        c = input.nextInt();

        result = a+b*c-b;
        System.out.println("The result is " + result);
    }
}