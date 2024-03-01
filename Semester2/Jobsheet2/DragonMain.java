package Jobsheet2;

public class DragonMain {
    public static void main(String[] args) {
        Dragon dr1 = new Dragon();
        dr1.height = 10;
        dr1.width = 10;
        dr1.x = 5;
        dr1.y = 7;

        dr1.printPosition();
        dr1.moveLeft();
        dr1.moveUp();
        dr1.moveRight();
        dr1.moveRight();
        dr1.moveDown();
        dr1.moveUp();
        dr1.moveLeft();
        dr1.moveUp();
        dr1.printPosition();
        dr1.moveUp();
        dr1.moveUp();
    }
}
