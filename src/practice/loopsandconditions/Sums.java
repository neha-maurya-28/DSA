package practice.loopsandconditions;

import java.util.Scanner;

public class Sums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int neg = 0;
        int pos_even = 0;
        int pos_odd = 0;
        while(true) {
            System.out.print("Enter the number: ");
            int num = sc.nextInt();
            if(num!=0){
                if(num<0){
                    neg += num;
                }else{
                    if(num % 2 == 0){
                        pos_even += num;
                    }else{
                        pos_odd += num;
                    }
                }
            }else{
                break;
            }
        }
        System.out.println("Sum of negative numbers: " + neg);
        System.out.println("Sum of positive even numbers: " + pos_even);
        System.out.println("Sum of positive odd numbers: " +  pos_odd);
    }
}
