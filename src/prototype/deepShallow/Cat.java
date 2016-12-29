package prototype.deepShallow;

/**
 * Created by Tony on 12/29/2016.
 */
//public class Cat {
//    private String name;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//}
public class Cat implements Cloneable {
    private String name;
    //private Integer age;
    private Age age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Age getAge() {
        return age;
    }

    public void setAge(Age age) {
        this.age = age;
    }

    public Cat copy() throws CloneNotSupportedException {
        Cat ret = (Cat)this.clone();
        //이대로는 Age 멤버는 shallow copy가 발생하므로 아래 수정 추가
        ret.setAge(new Age(this.age.year, this.age.value)); // deep copy

        return ret;
    }
}
