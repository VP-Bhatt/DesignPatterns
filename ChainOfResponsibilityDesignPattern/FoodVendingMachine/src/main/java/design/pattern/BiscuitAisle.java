package design.pattern;

public class BiscuitAisle extends VendingMachine {
    BiscuitAisle(VendingMachine vendingMachine) {
        super(vendingMachine);
    }

    @Override
    public void provide(ItemType itemType, String msg) {
        if (itemType == ItemType.BISCUIT) {
            System.out.println(msg);
        } else {
            super.provide(itemType, msg);
        }
    }
}
