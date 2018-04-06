package pl.codemakesfun.decorator;

public class Decorator {

    public static void main(String[] args) {
        SimpleCalc simpleCalc = new SimpleCalc("SimpleCalc");
        simpleCalc.showClacType();

        messagePrinter(simpleCalc.add(5,4));
        messagePrinter(simpleCalc.subtraction(5,4));
        messagePrinter(simpleCalc.div(5,4));
        messagePrinter(simpleCalc.multiply(5,4));

        AdvCalc advCalc = new AdvCalc("Kalkulator naukowy");
        advCalc.showClacType();
        messagePrinter(advCalc.PierwiastekKwadratowy(4));
        messagePrinter(advCalc.pierwiastek3Stopnia(125));
        messagePrinter(advCalc.add(5,4));
        messagePrinter(advCalc.div(5,4));
        messagePrinter(advCalc.subtraction(5,4));
        messagePrinter(advCalc.multiply(4,4));



    }

    public static void messagePrinter(double result) {
        System.out.println("\t: "+result);
    }
}
