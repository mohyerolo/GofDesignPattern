package template.own.process;

public abstract class Cleaning {
    public final void cleanTheHouse(String day) {
        openTheWindow();
        recycle(day);
        if (sunny()) {
            laundry();
        }

        vaccumTheFloor();
    }

    protected abstract void openTheWindow();

    protected abstract void laundry();
    protected boolean sunny() {
        return false;
    }

    protected void recycle(String day){
        String recycleType = switch (day) {
            case "월요일" -> "비닐";
            case "화요일" -> "플라스틱";
            case "수요일" -> "유리";
            case "목요일" -> "종이";
            case "금요일" -> "캔";
            default -> "재활용 받지 않는 날";
        };
        System.out.println("오늘은 " + recycleType);
    }

    protected void vaccumTheFloor() {
        System.out.println("청소기 돌리기");
    }
}
