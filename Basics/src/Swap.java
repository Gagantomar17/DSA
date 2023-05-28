//Q5 - Write a Java program to swap two numbers with the help of a third variable.
import java.util.Scanner;
public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c ;
        System.out.println("Enter first number : ");
        int a = sc.nextInt();

        System.out.println("Enter second number : ");
        int b = sc.nextInt();

        System.out.println("before swapping ");
        System.out.println("First number : " + a);
        System.out.println("Second number : " + b);

        c = a + b ;
        a = c - a ;
        b = c - b ;

        System.out.println("after swapping ");
        System.out.println("First number : " + a);
        System.out.println("Second number : " + b);

    }
}
