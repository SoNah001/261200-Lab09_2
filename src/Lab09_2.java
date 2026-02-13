import oop.lsp.*;

public class Main {
    public static void main(String[] args) {
        Flyable eagle = new Eagle();
        Flyable sparrow = new Sparrow();
        Moveable ostrich = new Ostrich();
        Moveable penguin = new Penguin();
        eagle.move();
        eagle.fly();
        sparrow.move();
        sparrow.fly();
        ostrich.move();
        penguin.move();
    }
}