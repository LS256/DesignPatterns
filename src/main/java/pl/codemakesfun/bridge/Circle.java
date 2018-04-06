package pl.codemakesfun.bridge;

public class Circle extends Shape {

    private int x, y, radius;

    protected Circle(int x, int y, int radius, DrawAPI drawApi) {
        super(drawApi);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void draw() {
        drawAPI.drawCircle(radius, x,y);
    }
}
