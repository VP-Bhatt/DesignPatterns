package design.pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        BasePizza pizza = new ExtraCheese(new MushroomToppings(new FarmhousePizza()));
        BasePizza pizza2 = new ExtraCheese(new MushroomToppings(new MarghritaPizza()));

        System.out.println(pizza.cost());
        System.out.println(pizza2.cost());

    }
}