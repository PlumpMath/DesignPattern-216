package interfaceTest;

/**
 * Created by Tony on 12/20/2016.
 */
public class Main {
    public static void main(String[] args){
        Ainterface ainterface = new AinterfaceImpl();

        //통로
        //ainterface.funcA();

        //위임을 적용한 경우 : Deligate
        AObj aObj = new AObj();
        aObj.funcAA();

        //스트레티지 패턴
        //여러 알고리즘을 하나의 추상적인 접근점을 만들어 접근 점에서 서로 교환 가능하도록 하는 패턴
        //접근점 : 인터페이스
    }
}
