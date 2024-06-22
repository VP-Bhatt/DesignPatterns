package design.pattern;

public class WaterAisle extends VendingMachine{


    WaterAisle(VendingMachine nextVendingMachine) {
        super(nextVendingMachine);
    }

    @Override
    public void provide(ItemType itemType, String msg) {
        if (itemType == ItemType.WATER) {
            System.out.println(msg);
        } else {
            super.provide(itemType, msg);
        }
    }
}
