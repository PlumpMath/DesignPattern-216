package singletone;

/**
 * Created by Tony on 12/29/2016.
 */
public class SystemSpeaker {
    static private SystemSpeaker instance;

    private int volume;

    private SystemSpeaker() {
        volume = 5;
    }

    public static SystemSpeaker getInstance() {
        if (instance == null){
            //시스템 스피커
            instance = new SystemSpeaker();
            //로그 추가
            System.out.println("새로 생성");
        }else {
            System.out.println("이미 생성");
        }
        return instance;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
