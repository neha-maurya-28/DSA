package practice.loopsandconditions;

import java.util.Scanner;

public class EvenDaysInAMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of days in the month: ");
        int days = sc.nextInt();
        System.out.println("Kunal can go out "+ days/2 + " days in this month.");
    }
}
