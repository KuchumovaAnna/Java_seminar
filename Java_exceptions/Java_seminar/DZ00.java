package Java_seminar;

public class DZ00 {

public static void main(String[] args) 
{
    method1();
}

public static void method1() throws  FileNotFoundException, ClassNotFoundException
{
    //тут кинется исключение  FileNotFoundException, такого файла нет
    FileInputStream fis = new FileInputStream("C2:\\badFileName.txt");
}
}