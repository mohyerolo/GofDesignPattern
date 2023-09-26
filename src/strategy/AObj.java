package strategy;

public class AObj {

    AInterface aInterface;

    public AObj() {
        aInterface = new AInterfaceImpl();
    }

    public void funcAA() {
//        System.out.println("AA");
        // 어떤 기능을 개발할때 그 책임을 다른 객체에 부여하는 것 -> 위임
        aInterface.funcA();
    }
}
