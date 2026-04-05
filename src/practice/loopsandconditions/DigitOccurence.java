package practice.loopsandconditions;

import java.util.Scanner;

public class DigitOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: " );
        int num = sc.nextInt();

        System.out.print("Enter the digit whose occurrence you wanna check: ");
        int check = sc.nextInt();

        int count = 0;

        while(num>0){
            if(num%10 == check){
                count++;
            }
            num /= 10;
        }
        System.out.println(check + " occurred " + count + " times.");
    }
}
