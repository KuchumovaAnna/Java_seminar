// Написать программу вычисления n-ого треугольного числа.
// Tn = 1/2n(n+1), n=1,2,3...

package Java_seminar;

public class DZ1 {

    public static int main(String[] args) {
        int n = 1;
        int result = 1;
        // public int triangle_number(int n) {
        if (n == 1)
            return 1;
        else
            System.out.println(result = n * (n + 1) / 2);
        return result;
    }
}
