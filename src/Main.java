import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String tea;
        final int NUM = 5;
        String word = "light";
        tea = NUM + word;
        System.out.println(tea + " " + NUM + " " + word);
        if (NUM > 0) {
            System.out.println("Вы сохранили положительное число");
        } else if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");
        } else {
            System.out.println("Вы сохранили ноль");
        }

        System.out.println("Введите ваше имя");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("hello " + name);
    }
}