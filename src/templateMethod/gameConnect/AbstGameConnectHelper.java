package templateMethod.gameConnect;

/**
 * Created by Tony on 12/28/2016.
 */
public abstract class AbstGameConnectHelper {
    //알고리즘의 단계이기때문에 외부에 노출이 되면 안된다. 그래서 private해야 하지만,
    //하위 클래스에서 상속해야하니깐 protected
    protected abstract String doSecurity(String string);
    protected abstract boolean authentication(String id, String password);
    protected abstract int authorization(String userName);
    protected abstract String connection(String info);

    //템플릿 메소드
    public String requestConnection(String encodedInfo){
        //보안 작업 -> 암호화 된 문자열을 복호화
        String decodedInfo = doSecurity(encodedInfo);

        //반환된 것을 가지고 아이디, 암호를 할당한다.
        String id = decodedInfo.substring(0, 3); // "aaa"
        String password = decodedInfo.substring(3, decodedInfo.length()); //"bbb"

        if (!authentication(id, password)){
            throw new Error("아이디 암호 불일치");
        }

        //정액제 낸사람만 접속되게 가능
        String userName = id; //"userName"
        int i = authorization(userName);

        switch (i) {
            case -1://미성년자
                throw new Error("Shut down");
            case 0://게임 매니저
                break;
            case 1://유료 회원
                break;
            case 2://무료 회원
                break;
            case 3://권한 없음
                break;
            default://기타 상황
                break;
        }
        return connection(decodedInfo);
    }
}
