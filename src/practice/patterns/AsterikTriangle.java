package practice.patterns;

public class AsterikTriangle {
    /*
         *
        ***
       *****
      *******
     *********
    */
    public static void main(String[] args) {
        int rows = 5;
        for(int i=0; i<rows; i++){
            for(int j=(i/2+1); j>i; j++){
                System.out.println('*');
            }
            System.out.println();
        }
    }
}
