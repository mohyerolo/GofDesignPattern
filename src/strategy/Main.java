package strategy;

public class Main {
    public static void main(String[] args) {
        AInterfaceImpl aInterface = new AInterfaceImpl();
        aInterface.funcA();

        AObj aObj = new AObj();
        aObj.funcAA();
    }

}
