package Lesson07;

public class Cat {
    private String type;
    private String name;
    private int appetite;
    private boolean full; //поле сытость

    public Cat(String name, int appetite) {
        this.type = "Кот";
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate p){
        full = p.decreaseFood(appetite);
    }

    public void info() {
        System.out.println(type + " " + name + (full ? " сыт." : " голоден."));
    }
}
