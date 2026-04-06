package practice.functions;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class MaxMin {
    static int max(int a, int b, int c){
        return Math.max(a, Math.max(b, c));
    }

    static int min(int a, int b, int c){
        return Math.min(a, Math.min(b, c));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();

        System.out.println("Maximum: " + max(num1, num2, num3));
        System.out.println("Minimum: " + min(num1, num2, num3));
    }
}
