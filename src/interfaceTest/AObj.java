package interfaceTest;

/**
 * Created by Tony on 12/19/2016.
 */
public class AObj {

    Ainterface ainterface;

    public AObj(){
        ainterface = new AinterfaceImpl();
    }

    public void funcAA() {

        //델리게이트 : 위임한다. (두 객체간에 관계) - AAA를 찍는 기능이 필요한것을 다른 객체로 넘김
        //여기선 Ainterface. 즉, 다른객체의 기능을 빌려서 사용
        ainterface.funcA();//		System.out.println("AAA");
        ainterface.funcA();//		System.out.println("AAA");
        //~ 기능이 필요합니다. 개발해주세요 (인터페이스로 구현해주고 우린 인터페이스를 사용)
    }
}
