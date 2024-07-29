package factory;

import factory.concrete.HpCreator;
import factory.concrete.MpCreator;
import factory.framework.Item;
import factory.framework.ItemCreator;

public class Main {
    public static void main(String[] args) {
        ItemCreator creator;
        Item item;

        creator = new HpCreator();
        item = creator.create();
        item.use();

        creator = new MpCreator();
        item = creator.create();
        item.use();
    }
}
