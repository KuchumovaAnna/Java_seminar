package EXCEPTIONS;

/*Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
Пользователю должно показаться сообщение, что пустые строки вводить нельзя. */

import java.util.Scanner;
public class dz24 {
    public static void main(String[] args) {
        inputString();
   }

    public static void inputString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сообщение ");
        String str = scanner.nextLine();
        scanner.close();
        if (str.isEmpty()) {
            throw new RuntimeException("Пустые строки вводить нельзя");
        } else {
            System.out.println("Сообщение введено корректно");
        } 
    }
}
