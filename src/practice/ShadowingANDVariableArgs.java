package practice;

import java.util.Arrays;

public class ShadowingANDVariableArgs {
    static int num = 10;
    private static int num1;

    public static void main(String[] args) {
        //changing the value of the variable defined in the higher scope
        //here value of num is shadowed again and again
        System.out.println("Original: " + num); //10
        int num = 100;
        System.out.println("Shadowed 1: " + num); //100
        change();

        varArgs(2, 6, 89, 21, 2352, 34, 68);
    }
    static void change(){
        int num1 = 50;
        System.out.println("Shadowed 2: " + num1); //50
    }

    //using ... before the argument name, make it a variable argument, which means user can give as many arguments they want
    static void varArgs(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
