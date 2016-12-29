package factoryMethod;

import factoryMethod.concrete.HpCreator;
import factoryMethod.concrete.MpCreator;
import factoryMethod.framework.Item;
import factoryMethod.framework.ItemCreator;

/**
 * Created by Tony on 12/29/2016.
 */
public class Main {
    public static void main(String[] args){
        ItemCreator creator;
        Item item;

        creator = new HpCreator();
        item = creator.create(); // create()만 보인다.

        item.use();

        creator = new MpCreator();
        item = creator.create();

        item.use();
    }
}
