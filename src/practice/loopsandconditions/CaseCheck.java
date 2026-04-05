package practice.loopsandconditions;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the alphabet: ");
        char input = sc.next().trim().charAt(0);
        if(input>='A' && input<='Z'){
            System.out.println("Upper Case");
        }
        else if(input>='a' && input<='z'){
            System.out.println("Lower Case");
        }
        else{
            System.out.println("Not an alphabet");
        }

    }
}
