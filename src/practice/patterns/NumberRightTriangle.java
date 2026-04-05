package practice.patterns;

public class NumberRightTriangle {
    /*
    1
    12
    123
    1234
    */
    public static void main(String[] args) {
        for(int i=1; i<5; i++){
            for(int j=1; j<i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println("================================================");

        for(int i=4; i>0; i--){
            for(int j=1; j<i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

}
