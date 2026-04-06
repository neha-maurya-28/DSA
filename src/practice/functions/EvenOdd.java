package practice.functions;

import java.util.Scanner;

public class EvenOdd {
    static String checkEvenOdd(int num){
        if(num % 2 == 0){
            return "even";
        }else{
            return "odd";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.println("It is " + checkEvenOdd(num));
    }
}
