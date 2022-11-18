package Java_seminar;
import java.util.Arrays;

public class DZ003 {
    public static void main(String[] args) {
        int[] firstArray = {10,1};
        int[] secondArray = {2,0};
        System.out.println(Arrays.toString(createArrayByDividing(firstArray, secondArray)));
    }

    public static int[] createArrayByDividing(int[] firstArray, int[] secondArray) {
        if (firstArray.length != secondArray.length) {
            throw new RuntimeException("Lengths of arrays are not equal");
        }
        else { 
            int[] newArray = new int[firstArray.length];
            for (int i = 0; i < newArray.length; i++) {
                if(secondArray[i] == 0) {
                    throw new RuntimeException("Division by zero");
                }
               newArray[i] = firstArray[i] / secondArray[i]; 
            }
            return newArray;
        }
    }
}

