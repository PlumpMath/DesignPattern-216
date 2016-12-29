package factoryMethod.concrete;

import factoryMethod.framework.Item;

/**
 * Created by Tony on 12/29/2016.
 */
public class HpPotion implements Item {
    @Override
    public void use() {
        System.out.println("체력 회복!");
    }
}
