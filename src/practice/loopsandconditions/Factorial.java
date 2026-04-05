package practice.loopsandconditions;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number whose factorial you want: ");
        int num = sc.nextInt();
        int fact = 1;

        while(num>0){
            fact *= num;
            num--;
        }
        System.out.println("Sum of digits is "+ fact);
    }
}
