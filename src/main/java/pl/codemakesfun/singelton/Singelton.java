package pl.codemakesfun.singelton;

public class Singelton {
    private static Singelton instance = new Singelton();

    private Singelton(){

    }

    public static Singelton getSingelton(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Inside Singelton object..!!");
    }
}
