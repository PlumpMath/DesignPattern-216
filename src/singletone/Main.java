package singletone;

/**
 * Created by Tony on 12/29/2016.
 */
public class Main {
    public static void main(String[] args){
        //SystemSpeaker speaker1 = new SystemSpeaker(); <- private
        SystemSpeaker speaker1 = SystemSpeaker.getInstance();
        SystemSpeaker speaker2 = SystemSpeaker.getInstance();

        //5, 5
        System.out.println(speaker1.getVolume());
        System.out.println(speaker2.getVolume());

        speaker1.setVolume(11);
        //11, 11
        System.out.println(speaker1.getVolume());
        System.out.println(speaker2.getVolume());

        speaker2.setVolume(22);
        System.out.println(speaker1.getVolume());
        System.out.println(speaker2.getVolume());
    }
}
