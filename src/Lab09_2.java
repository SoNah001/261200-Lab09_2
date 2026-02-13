import oop.lsp.*;

public class Lab09_2 {
    public static void main(String[] args) {
        Flyable eagle = new Eagle(); //เพื่อแยกว่านกบางตัวไม่สามารถบินได้
        Flyable sparrow = new Sparrow();
        Moveable ostrich = new Ostrich();
        Moveable penguin = new Penguin();
        eagle.move(); //ใช้ได้เพราะ Flyable สืบทอดมาจาก Moveable
        eagle.fly();
        sparrow.move(); //ใช้ได้เพราะ Flyable สืบทอดมาจาก Moveable
        sparrow.fly();
        ostrich.move();
        penguin.move();
    }
}