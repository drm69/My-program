package Jobsheet2;

public class Dragon {
    int x, y, width, height;


    void printPosition() {
        System.out.println("======================");
        System.out.println("Posisi naga : " +x+ ", " +y);
        System.out.println("Panjang area: " +width);
        System.out.println("Tinggi area : " +height);
    }

    void moveLeft() {
        if (x > 0) {
            x -= 1;
        }else {
            x -= 1;
            detectCollision(x, y);
        }
    }

    void moveRight() {
        if (x < width) {
            x += 1;
        }else {
            x += 1;
            detectCollision(x, y);
        }
    }

    void moveUp() {
        if (y < height) {
            y += 1;
        }else {
            y += 1;
            detectCollision(x, y);  
        }
    }

    void moveDown() {
        if (y > 0) {
            y -= 1; 
        }else {
            y -= 1; 
            detectCollision(x, y);
        }
    }

    void detectCollision(int x, int y) {
        System.out.println("======================");
        System.out.println("Posisi naga : " +x+ ", " +y);
        System.out.println("Naga melebihi batas area");
        System.out.println("Game Over!!!");
    }

}
