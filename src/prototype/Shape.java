package prototype;

/**
 * Created by Tony on 12/29/2016.
 */
public class Shape implements Cloneable {
//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
