//Задано уравнение вида q + w = e, q, w, e >= 0.
//Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69.
//Требуется восстановить выражение до верного равенства.
//Предложить хотя бы одно решение или сообщить, что его нет.
package Java_seminar;

public class DZ31 {
    public static void main(String[] args){
        int a = (int)(Math.random()*5);
        int b = ((int)(Math.random()*5))*10;
        System.out.println(a);
        System.out.println(b);

        int q = 20+a;
        int w=b+5;

        if (q+w==69) {
            System.out.println(q+w);
        } else {
            System.out.println("Решения нет");
        }
    }
}
