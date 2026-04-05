package practice.loopsandconditions;

import java.util.Scanner;

public class UserNumLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        while(true){
            System.out.print("Enter the number: ");
            int num = sc.nextInt();
            if(num!=0){
                max = Math.max(max, num);
            }else{
                break;
            }
        }
        System.out.println("Maximum number is " + max);
    }
}
