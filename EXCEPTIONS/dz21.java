package EXCEPTIONS;
/*Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), 
и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению 
приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.*/

import java.util.Scanner;

public class dz21 {
    public static void main(String[] args) {
        inputNumber();
   }

   public static void inputNumber() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите дробное число (типа float), используя в качестве разделителя запятую ");
    if (scanner.hasNextFloat()){
        Float number = scanner.nextFloat();
        System.out.println("Введено число " + number);

    } else {
       System.out.println("Число введено некорректно. Попробуйте снова");
       inputNumber(); 
    } 
    scanner.close();
   }
}
