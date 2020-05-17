package Lesson03;

// Программа загадывает случайное число от 0 до 9, пользователю дается 3 попытки угадать
//При каждой попытке компьютер должен сообщить больше ли указанное пользователем число чем загаданное, или меньше.
//После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет)

import java.util.Scanner;
import java.lang.Math;

public class GuessNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Угадай число от 0 до 9 за три попытки");

            do {int a = 0;
                int b = 9;

                int random_number = a + (int) (Math.random() * b);

            for (int i = 3; i > 0; i--) {
                System.out.println("Введите ответ: ");
                int user_number = sc.nextInt();
                if (user_number == random_number) {
                    System.out.println("Вы угадали число!");
                    break;
                } else {
                    System.out.println("Ваше число " + ((user_number > random_number)? "больше." : "меньше."));
                    System.out.println((i-1) > 0 ? "У Вас осталось " + (i-1) + " попыток." : "Попытки закончились.");
                    }
                }
                System.out.println("Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет)");
        } while (sc.nextInt() == 1);
    }
}
