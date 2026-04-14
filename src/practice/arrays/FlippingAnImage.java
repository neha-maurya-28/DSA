package practice.arrays;

import java.util.Arrays;

public class FlippingAnImage {
    public static int[][] flipAndInvertImage(int[][] image) {
        for(int i = 0; i < image.length; i++){
            for (int j = 0; j < image.length; j++) {
                image[i][j] ^= 1;
            }
            int left = 0;
            int right = image.length-1;
            while(left < right){
                image[i][left] += image[i][right];
                image[i][right] = image[i][left] - image[i][right];
                image[i][left] = image[i][left] - image[i][right];
                left++; right--;
            }
        }
        return image;
    }
    public static void main(String[] args) {
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
        System.out.println(Arrays.deepToString(image));
        System.out.println(Arrays.deepToString(flipAndInvertImage(image)));
    }
}
