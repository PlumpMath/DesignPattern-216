package strategy;

import interfaceTest.AObj;
import interfaceTest.Ainterface;
import interfaceTest.AinterfaceImpl;

/**
 * Created by Tony on 12/20/2016.
 */
public class Main {
    public static void main(String[] args){
        //스트레티지 패턴
        //여러 알고리즘을 하나의 추상적인 접근점을 만들어 접근 점에서 서로 교환 가능하도록 하는 패턴
        //접근점 : 인터페이스

        GameCharacter character = new GameCharacter();

        //weapon이 할당 안된 경우 NullPointerException에러남
        character.attack();

        character.setWeapon(new Knife());
        character.attack();

        character.setWeapon(new Sword());
        character.attack();

        //도끼 추가 유지보수 : 칼을 카피해서 도끼로 만들고 아래 추가 for test
        character.setWeapon(new Axe() );
        character.attack();
    }
}
