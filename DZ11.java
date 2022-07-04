// Есть отсортированный массив, нужно используя минимальное количество попыток найти загаданное число
package Java_seminar;

import java.util.Arrays;

public class DZ11 {

    public static void main(String[]args) {
        int[]SortArr=[1,2,3,4,5,6,7];
        int key=Arrays.binarySearch(SortArr, key);
        System.out.println(key);
    }
}