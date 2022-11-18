package EXCEPTIONS;

public class dz23 {
    public static void main(String[] args) {

        int a = 90;
        int b = 0;
        if (b == 0) {
            System.out.println("Попытка деления на ноль!");
        } else {
            System.out.println(a / b);
        }


        printSum(null, 234);


        int[] abc = { 1, 2 };
        try {
            abc[3] = 9;  
        } catch(IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        }
    }

    public static void printSum(Integer a, Integer b) {
        if (a == null || b == null) {
            System.out.println("Указатель не может указывать на null!");
        } else { 
            System.out.println(a + b);
        }
    }

}
