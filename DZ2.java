package Java_seminar;

// Написать программу возрващающее число, которoе без остатка делится на сумму цифр этого числа.
//import java.util.Scanner;

public class DZ2 {

    public static boolean main(String[] args) {
        // try (Scanner input = new Scanner(System.in)) {
        // System.out.println("Введите трехзначное число ");
        // String numbers = input.nextLine();
        // int sum = 0;
        // for (char c : numbers.toCharArray()) { // подсмотрела в гугле)
        // sum += c - '0';
        // }
        // System.out.println(sum);
        // }
        // }
        // }

        int num = 323;
        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        System.out.println(sum);
        if (num % sum == 0)
            return true;
        else
            return false;

    }
}