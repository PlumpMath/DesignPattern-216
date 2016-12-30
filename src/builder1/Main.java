package builder1;

/**
 * Created by Tony on 12/29/2016.
 */
public class Main {
    public static void main(String[] args){

        //생성을 다른 객체에 넘겨주면 더 쉽다

        //팩토리가 있고
        ComputerFactory factory = new ComputerFactory();

        //팩토리에 LG블루프린트를 설계도로 주고, (컴퓨터 만큼 만들어준다. 설계도)
        factory.setBlueprint(new LgGramBlueprint());

//        factory.setBlueprint(new MacAirBlueprint());
//        factory.setBlueprint(new SonyBlueprint());

//        Computer computer = factory.makeAndGet();

        //설계도를 바탕으로 만들고
        factory.make();

        //만들어진결과값 가져옴
        Computer computer = factory.getComputer();
        //Computer computer = new Computer("i7", "16g", "256g ssd");

        System.out.println(computer.toString());
    }
}
