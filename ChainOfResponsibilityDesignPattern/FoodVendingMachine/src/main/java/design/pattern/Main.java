package design.pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        VendingMachine vendingMachine = new BiscuitAisle(new ChipsAisle(new WaterAisle(new CocaColaAisle(null))));

        vendingMachine.provide(ItemType.COCA_COLA,"Providing 1 cocacola");
    }
}