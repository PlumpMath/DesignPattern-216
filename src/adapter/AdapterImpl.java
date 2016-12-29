package adapter;

/**
 * Created by Tony on 12/20/2016.
 */
public class AdapterImpl implements Adapter {

//    Math math;

    @Override
    public Float twiceOf(Float f) {
//        math.~
        //return (float) Math.twoTime(f.doubleValue());
        return Math.doubled(f.doubleValue()).floatValue(); //강화된 doubled
    }

    @Override
    public Float halfOf(Float f) {
        System.out.println("halfOf 함수 시작"); //Math대신 여기서 로그를 찍는다.
        return (float) Math.half(f.doubleValue());
    }
}
