package template.own.process;

public class SunnyDayCleaning extends Cleaning {
    @Override
    protected void openTheWindow() {
        System.out.println("날이 밝으니까 창문을 활짝 열었다.");
    }

    @Override
    protected void laundry() {
        System.out.println("화창해서 빨래 가능");
    }

    @Override
    protected boolean sunny() {
        System.out.println("해가 너무 쨍쨍해");
        return true;
    }
}
