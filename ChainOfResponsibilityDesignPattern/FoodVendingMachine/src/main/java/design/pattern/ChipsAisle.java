package design.pattern;

public class ChipsAisle extends VendingMachine{

    ChipsAisle(VendingMachine vendingMachine){
        super(vendingMachine);
    }

    @Override
    public void provide(ItemType itemType, String msg){
        if(itemType == ItemType.CHIPS){
            System.out.println(msg);
        }
        else{
            super.provide(itemType, msg);
        }
    }
}
