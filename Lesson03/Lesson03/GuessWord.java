package Lesson03;

//Создать массив из слов
//При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя, сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь.
//Если слово не угадано, компьютер показывает буквы которые стоят на своих местах.

import java.util.Random;
import java.util.Scanner;

public class GuessWord {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

     int n = rnd.nextInt(words.length);
     String word = words[n];
     int n = word.length();
     System.out.println("Я загадал слово, попробуй отгадать его");
     System.out.println(word);
    }
}
