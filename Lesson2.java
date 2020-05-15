package L2;

public class Lesson2 {

    public static void main(String[] args) {

        // 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
        // С помощью цикла и условия заменить 0 на 1, 1 на 0;

        System.out.print("Решение 1: ");
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] == 0) ? 1 : 0;
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
// 2. Задать пустой целочисленный массив размером 8
// С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21

        System.out.print("Решение 2: ");
        int[] arr2 = new int[8];
        int j = 0;
        int array = arr2.length;
        for (int i = 0; i < array; i++, j = j + 3) {
            arr2[i] = j;
            System.out.print(arr2[i] + " ");
        }
        System.out.println(" ");

// 3.Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
// пройти по нему циклом, и числа меньшие 6 умножить на 2

        System.out.print("Решение 3: ");
        int[] w = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < w.length; i++) {
            if (w[i] < 6) w[i] *= 2;
            System.out.print(w[i] + " ");
        }
        System.out.println(" ");

        //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое)
        // с помощью цикла(-ов) заполнить его диагональные элементы единицами;

        System.out.println("Решение 4: ");
        int[][] arr4 = new int[4][4];
        for (int i = 0; i < arr4.length; i++) {
            for (int h = 0, h2 = arr4[i].length; h < arr4[i].length; h++, h2--) {
                if (i == h || i == (h2 - 1)) arr4[i][h] = 1;
                System.out.print(" " + arr4[i][h] + " ");
            }
            System.out.println();
        }
    }
}
