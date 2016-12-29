package adapter;

/**
 * Created by Tony on 12/20/2016.
 */
public class Math {
    //두배
    public static double twoTime(double num){ return num * 2; } // 요구사항은 Float
    //절반
    public static double half(double num){
//        System.out.println("half 함수 호출"); 이런식으로 library 함수를 직접 호출 안함(사람마다 가져다 쓰므로)
        return num / 2;
    }

    //강화된 알고리즘
    public static Double doubled(Double d){ return d * 2; }
}
