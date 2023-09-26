package strategy.example;

public class Character {
    // 접근점
    private Weapon weapon;

    // 교환 가능
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void attack() {
        if (weapon == null) {
            System.out.println("no weapon");
        } else {
            // 델리게이트: 공격이라는 기능이 어떤 걸 들고있는지에 따라 형태가 달라지기 때문
            weapon.attack();
        }
    }
}
