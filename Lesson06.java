import java.util.Random;
import java.math.RoundingMode;

public class Lesson06 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Боб");
        Cat cat2 = new Cat("Джесси");

        Dog dog1 = new Dog("Лорд");
        Dog dog2 = new Dog("Нана");

        cat1.info();
        cat1.run(200);
        cat1.jump(2.0);
        cat1.swim(5);

        System.out.println();

        dog1.info();
        dog1.run(500);
        dog1.jump(0.5);
        dog1.swim(10);
    }

    public static class Animal {
        protected String name;
        protected String type;
        protected int maxLength;
        protected double maxHeight;
        protected int maxSwim;
        public Random random = new Random();

        public Animal(String name) {
            this.name = name;
        }

        public void run(int dist) {
            if (this.maxLength >= dist) System.out.println(this.type + " " + this.name + " пробежал " + dist + " м.");
            else System.out.println(this.type + " " + this.name + " не может пробежать " + dist + " м.");
        }

        public void jump(double wall) {
            if (this.maxHeight >= wall) System.out.println(this.type + " " + this.name + " прыгнул " + wall + " м.");
            else System.out.println(this.type + " " + this.name + " не перепрыгнет " + wall + " м.");
        }

        public void swim(int water) {
            if (this.maxSwim >= water) System.out.println(this.type + " " + this.name + " проплыл " + water + " м.");
            else System.out.println(this.type + " " + this.name + " не проплывет " + water + " м.");
        }

        public void info() {
            System.out.println(this.type + " " + this.name + " может пробежать: " + this.maxLength + " м., прыгнуть на: " + this.maxHeight + " м., проплыть: " + this.maxSwim + " м.");
        }
    }

    static class Cat extends Animal {

        public Cat(String name) {
            super(name);
            this.type = "Кот";
            this.maxLength = random.nextInt(100) + 150;
            this.maxHeight = random.nextDouble() + 0.5;
        }

        @Override
        public void swim(int water) {
            System.out.println(type + " не хочет плыть.");
        }
    }

    static class Dog extends Animal {
        public Dog(String name) {
            super(name);
            this.type = "Собака";
            this.maxLength = random.nextInt(600) + 100;
            this.maxHeight = random.nextDouble() + 0.5;
            this.maxSwim = random.nextInt(10) + 2;
        }
    }
}





