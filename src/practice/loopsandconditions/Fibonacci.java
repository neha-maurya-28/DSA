package practice.loopsandconditions;

import java.util.Scanner;

public class Fibonacci {
    public static int fibonacciTerm(int n){
//        if(n <= 1){
//            return n;
//        }
//        return (fibonacciTerm(n-1)+fibonacciTerm(n-2));
        int a = 0, b = 1;
        int count=2;
        int num = 0;
        while(count<=n){
            num = a + b;
            a = b;
            b = num;
            count++;
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms you want the series: ");
        int n = sc.nextInt();

        //to get the term at a particular position in the fibonacci series
        System.out.println("Term at "+n+" position is "+fibonacciTerm(n));

        //to print the whole series, with n number of terms
//        if(n >= 1){
//            System.out.println(0);
//        }
//        if(n >= 2){
//            System.out.println(1);
//        }
//        if(n>2){
//            int a = 0, b = 1;
//            for(int i=2; i<n; i++){
//                int c = a + b;
//                System.out.println(a+b);
//                a = b;
//                b = c;
//            }
//        }

    }
}
