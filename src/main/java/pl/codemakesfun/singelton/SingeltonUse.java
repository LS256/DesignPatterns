package pl.codemakesfun.singelton;

/*
 * Class where Singelton pattern is presented.
 */
public class SingeltonUse {

    public static void main(String[] args) {
        /*
         * Singelton in fast way usage
         */
        Singelton.getSingelton().showMessage();

        /*
         * Or longer way of calling singelton
         */
        Singelton singelton = Singelton.getSingelton();
        singelton.showMessage();
    }

}
