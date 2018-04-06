package pl.codemakesfun.bridge;

public abstract class Shape{
    public DrawAPI drawAPI;

    protected Shape(DrawAPI drawApi){
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
 }
