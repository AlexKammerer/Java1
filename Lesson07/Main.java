package Lesson07;

public class Main {

    static Cat[] cats = new Cat [5];

    public static void main(String[] args) {

        cats[0] = new Cat("Боб", 40);
        cats[1] = new Cat("Рыжий", 20);
        cats[2] = new Cat("Нана", 5);
        cats[3] = new Cat("Уилл", 20);
        cats[4] = new Cat("Рокки", 60);

        Plate plate = new Plate(50);
        plate.info();

        for (Cat itemCat:cats) {
            itemCat.eat(plate);
            itemCat.info();
        }

        plate.info();
    }
}
