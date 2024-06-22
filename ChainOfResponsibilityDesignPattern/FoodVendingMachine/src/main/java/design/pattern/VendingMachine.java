package design.pattern;

public abstract class VendingMachine {

    ItemType itemType;

    VendingMachine nextVendingMachine;

    VendingMachine(VendingMachine nextVendingMachine){
        this.nextVendingMachine = nextVendingMachine;
    }

    public void provide(ItemType itemType, String msg){
        if(nextVendingMachine != null){
            nextVendingMachine.provide(itemType, msg);
        }
    }
}
