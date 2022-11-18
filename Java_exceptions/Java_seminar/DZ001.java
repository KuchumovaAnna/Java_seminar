package Java_seminar;

public class DZ001 {
    public static void main(String[] args) {
        //System.out.println(divide(10, 0));
        //System.out.println(parsing("Hello"));
        int[] array = {1, 2};
        System.out.println(findValue(array));
    }

    public static int divide(int a, int b) {
        return a/b;
    }

    public static int parsing(String a) {
        return Integer.parseInt(a);
    }

    public static int findValue(int[] array) {
        if (array.length >= 3) {
            return array.length;
        }
        else {
            throw new RuntimeException("Array length is less than 3");
        }
    }
} 


