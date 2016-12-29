package prototype.deepShallow;

/**
 * Created by Tony on 12/29/2016.
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Cat navi = new Cat();
        navi.setName("navi");
        //navi.setAge(3);
        navi.setAge(new Age(2012,3));

        //Cat yo = navi; //둘다 같은 주소값을 갖고 있다 : shallow copy
        Cat yo = navi.copy();
        yo.setName("yo");
        //yo.setAge(1);
        //yo.setAge(new Age(2013,2));
        yo.getAge().setYear(2013);
        yo.getAge().setValue(2);

        System.out.println(navi.getName());
        System.out.println(yo.getName());

        System.out.println(navi.getAge().getYear());
        System.out.println(yo.getAge().getYear());

        System.out.println(navi.getAge().getValue());
        System.out.println(yo.getAge().getValue());
    }
}
