package practice.functions;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeBetweenTwoNumbers {
    private static ArrayList<Integer> prime;

    static void printPrimeBetweenThese(int n1, int n2){
        ArrayList<Integer> prime = new ArrayList<Integer>();
            for(int i = n1; i <= n2; i++){
                if(i <= 1){
                    continue;
                }
                boolean isPrime = true;
                for(int j = 2; j <= Math.sqrt(i); j++){
                    if(i % j == 0){
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime){
                    prime.add(i);
                }
            }
        System.out.print("Prime numbers: " + prime);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        printPrimeBetweenThese(num1, num2);
    }
}
