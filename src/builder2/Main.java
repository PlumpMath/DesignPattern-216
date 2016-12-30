package builder2;

/**
 * Created by Tony on 12/30/2016.
 */
public class Main {
    public static void main(String[] args){
//        순서가 이렇게 바뀌면 망하는거
//        Computer computer = new Computer("256g ssd", "i7", "8g");
        Computer computer = ComputerBuilder
                .startWithCpu("i7")
//                .start()
                .setCpu("i7")
                .setRam("8g")
//                .setStorage("256g ssd") //이건 ComputerBuilder시 default사용
                .build();
        System.out.println(computer.toString());
    }
    //Builder의 목적은 많은 함수를 가지고 있는애들이 헷깔리지 않게 정해주는게 목적
}
