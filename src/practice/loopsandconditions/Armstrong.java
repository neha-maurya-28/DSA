package practice.loopsandconditions;

import java.util.Scanner;

public class Armstrong {
    public static int noOfDigits(int num){
        int count = 0;
        while(num>0){
            count++;
            num /= 10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int test = num;
        int len = noOfDigits(num);
        int armstrong = 0;

        while(num>0){
            armstrong += (int)Math.pow(num%10, len);
            num /= 10;
        }

        if(armstrong == test){
            System.out.println("It is an armstrong number.");
        }else{
            System.out.println("It is not an armstrong number.");
        }
    }
}
