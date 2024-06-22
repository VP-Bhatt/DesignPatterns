package design.pattern;

public class CocaColaAisle extends VendingMachine {

    CocaColaAisle(VendingMachine vendingMachine) {
        super(vendingMachine);
    }

    @Override
    public void provide(ItemType itemType, String msg) {
        if (itemType == ItemType.COCA_COLA) {
            System.out.println(msg);
        } else {
            super.provide(itemType, msg);
        }
    }
}
