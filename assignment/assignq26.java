package test;
import java.util.Arrays;
public class assignq26 {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = new int[arr1.length];

        for(int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }

        System.out.println("Original array: " + Arrays.toString(arr1));
        System.out.println("Copied array:   " + Arrays.toString(arr2));
    }
}