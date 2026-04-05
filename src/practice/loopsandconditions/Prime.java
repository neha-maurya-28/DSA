package practice.loopsandconditions;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        boolean prime = false;

        int check = (int)Math.sqrt(num);
        if (num >= 2) {
            for(int i=2; i<=check; i++){
                if(num % i == 0){
                    prime = true;
                    break;
                }
            }
        }
        if(prime == true){
            System.out.println("It is a prime number.");
        }else{
            System.out.println("It is not a prime number");
        }
    }
}
