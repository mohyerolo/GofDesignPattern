package factory.concrete;

import factory.framework.Item;
import factory.framework.ItemCreator;

import java.util.Date;

public class MpCreator extends ItemCreator {
    @Override
    protected void requestItemsInfo() {
        System.out.println("데이터베이스에서 마력 회복 물약 정보 가져옴");
    }

    @Override
    protected void createItemLog() {
        System.out.println("마력 회복 물약 생성, " + new Date());
    }

    @Override
    protected Item createItem() {
        return new MpPotion();
    }
}
