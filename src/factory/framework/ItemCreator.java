package factory.framework;

public abstract class ItemCreator {

    public Item create() {
        Item item;

        requestItemsInfo();
        item = createItem();
        createItemLog();

        return item;
    }

    protected abstract void requestItemsInfo();
    protected abstract void createItemLog();
    protected abstract Item createItem();
}
