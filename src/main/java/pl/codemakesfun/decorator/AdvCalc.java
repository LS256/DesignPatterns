package pl.codemakesfun.decorator;

public class AdvCalc extends SimpleCalc {


    AdvCalc(String calcType) {
        super(calcType);
    }

    public double PierwiastekKwadratowy(double a) {
        if(a < 0) {
            return 0;
        }
        return Math.sqrt(a);
    }

    public double pierwiastek3Stopnia(double a){
        if(a < 0) {
            return 0;
        }
        return Math.sqrt(Math.sqrt(a));
    }

    public void showClacType() {
        System.out.println("Calculator type: " + calcType);
    }

}
