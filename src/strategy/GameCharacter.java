package strategy;

/**
 * Created by Tony on 12/20/2016.
 */
public class GameCharacter {

    //접근점
    private Weapon weapon;

    //교환가능
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void attack() {
        //weapon이 할당 안된경우(null) 처리
        if (weapon == null) {
            System.out.println("맨손 공격");
        } else {
            //델리게이트
            weapon.attack();
        }
    }
}
