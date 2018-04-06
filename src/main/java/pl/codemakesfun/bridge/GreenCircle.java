package pl.codemakesfun.bridge;

public class GreenCircle implements DrawAPI{

    public void drawCircle(int radius, int x, int y) {
        System.out.println("Draw Green Circle with radius: " + radius + " and center point at: x: " + x +", y: " + y);
    }
}
