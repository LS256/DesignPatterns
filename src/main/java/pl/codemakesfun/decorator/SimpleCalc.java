package pl.codemakesfun.decorator;

public class SimpleCalc implements IKalulator {


    String calcType;

    SimpleCalc(String calcType){
        this.calcType = calcType;
    }

    public String getCalcType() {
        return calcType;
    }

    public void setCalcType(String calcType) {
        this.calcType = calcType;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public double subtraction(double a, double b) {
        return a - b;
    }

    public double div(double a, double b) {
        if(b == 0.0f) {
            return 0;
        }
        return a/b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public void showClacType() {
        System.out.println("Calculator type: " + calcType);
    }
}
