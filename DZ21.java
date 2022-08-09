//Написать метод, который будет эмулировать работу динамического массива 
//(Без исопользования коллекций)
package Java_seminar;

public class DZ21 {
    public static int[] incrSize(int arr[]) {
        int len = arr.length;
        int newArr[] = new int[len+1];
        return newArr;
    }
    public static void main(String[] args) {
        int a[] = new int[10];
        System.out.println("Размер до: " + a.length);
        a = incrSize(a); 
        System.out.println("Размер после: " + a.length);
    }
}
