package template.own.process;

public class RainyDayCleaning extends Cleaning {
    @Override
    protected void openTheWindow() {
        System.out.println("비가 와서 창문을 조금만 열어야겠다.");
    }

    @Override
    protected void laundry() {

    }
}
