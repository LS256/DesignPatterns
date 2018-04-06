package pl.codemakesfun.bridge;

public class RedCircle implements DrawAPI{

    public void drawCircle(int radius, int x, int y) {
        System.out.println("Draw Red Circle with radius: " + radius + " and center point at: x: " + x +", y: " + y);
    }
}
