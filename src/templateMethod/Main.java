package templateMethod;

import templateMethod.gameConnect.AbstGameConnectHelper;
import templateMethod.gameConnect.DefaultGameConnectHelper;

/**
 * Created by Tony on 12/29/2016.
 */
public class Main {
    public static void main(String[] args) {
        AbstGameConnectHelper helper = new DefaultGameConnectHelper();
        helper.requestConnection("아이디 암호 등 접속 정보");
    }
}
