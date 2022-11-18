package EXCEPTIONS;

public class dz22 {
    public static void main(String[] args) {
        try {
            int d = 0;
            int[] arr = new int[9];
            int catchedRes1 = arr[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
         } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
         }
         // если хотим использовать double - деление на 0 допускается, не дает нам ArithmeticException

    }
}
