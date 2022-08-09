//+Написать программу, показывающую последовательность действий для игры “Ханойская башня”

package Java_seminar;

public class DZ32 {
    static void towerOfHanoi(int n, int i, int j, int k) {

        if (n == 1)

        {

            System.out.println("Move disk 1 from rod " + i + " to rod " + j);

            return;

        }

        towerOfHanoi(n - 1, i, k, j);

        System.out.println("Move disk " + n + " from rod " + i + " to rod " + j);

        towerOfHanoi(n - 1, k, j, i);

    }

    public static void main(String args[]) {

        int n = 4; // Количество дисков

        towerOfHanoi(n, 0, 0, 0);

    }

}
