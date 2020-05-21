package Lesson04;

import java.util.Scanner;
import java.util.Random;

public class Lesson04 {

    public static final String USER_SIGN = "X";
    public static final String AI_SIGN = "O";
    public static final String NOT_SIGN = "*";
    public static int aiLevel = 1;
    public static final int DIMENSION = 4;
    public static String[][] field = new String[DIMENSION][DIMENSION];

    public static void main(String[] args) {
        int count = 0;
        initField();
        while (true) {
            printField();
            userShot(USER_SIGN);
            count++;
            if (checkWin(USER_SIGN)) {
                System.out.println("Победил игрок!");
                printField();
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiShot();
            count++;
            if (checkWin(AI_SIGN)) {
                System.out.println("Победил ИИ!");
                printField();
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
    }

    //Инициализация поля
    private static void initField() {
        for (int i = 0; i < DIMENSION; i++) {
            for (int j = 0; j < DIMENSION; j++) {
                field[i][j] = NOT_SIGN;
            }
        }
    }

    //Вывод поля
    private static void printField() {
        for (int i = 0; i <= DIMENSION; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < DIMENSION; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < DIMENSION; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
    }

    //Проверка наполненности поля
    public static boolean isMapFull() {
        for (int i = 0; i < DIMENSION; i++) {
            for (int j = 0; j < DIMENSION; j++) {
                if (field[i][j] == NOT_SIGN) return false;
            }
        }
        return true;
    }

    //Ход игрока
    private static void userShot(String sign) {
        int x = -1;
        int y = -1;
        do {
            System.out.println("Введите координаты x y (1 - " + DIMENSION + "): ");
            Scanner sc = new Scanner(System.in);
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        }
        while (isCellBusy(x, y));
        field[x][y] = sign;
    }

    //Ход ИИ
    public static void aiShot() {
        int x = -1;
        int y = -1;
        boolean ai_win = false;
        boolean user_win = false;
        // Блокировка выигрышного хода игрока
        if (aiLevel == 1) {
            if (!ai_win) {
                for (int i = 0; i < DIMENSION; i++) {
                    for (int j = 0; j < DIMENSION; j++) {
                        if (!isCellBusy(i, j)) {
                            field[i][j] = USER_SIGN;
                            if (checkWin(USER_SIGN)) {
                                x = i;
                                y = j;
                                user_win = true;
                            } field[i][j] = NOT_SIGN;
                        }
                    }
                }
            }
        }
        if (!ai_win && !user_win) {
            do {
                Random rnd = new Random();
                x = rnd.nextInt(DIMENSION);
                y = rnd.nextInt(DIMENSION);
            } while (isCellBusy(x, y));
        } field[x][y] = AI_SIGN;
    }

    //Проверка занятости
    public static boolean isCellBusy(int x, int y) {
        if (x < 0 || y < 0 || x > DIMENSION - 1 || y > DIMENSION - 1) {
            return false;
        }
        return field[x][y] != NOT_SIGN;
    }

    //Проверка по линии. При необходимости заменить количество фишек для победы - изменить DIMENSION
    public static boolean checkLine(int start_x, int start_y, int dx, int dy, String sign) {
        for (int i = 0; i < DIMENSION; i++) {
            if (field[start_x + i * dx][start_y + i * dy] != sign)
                return false;
        }
        return true;
    }

    //Проверка всех линий
    public static boolean checkWin(String sign) {
        for (int i = 0; i < DIMENSION; i++) {
            if (checkLine(i, 0, 0, 1, sign)) return true;
            if (checkLine(0, i, 1, 0, sign)) return true;
        }
        if (checkLine(0, 0, 1, 1, sign)) return true;
        if (checkLine(0, DIMENSION - 1, 1, -1, sign)) return true;
        return false;
    }
}