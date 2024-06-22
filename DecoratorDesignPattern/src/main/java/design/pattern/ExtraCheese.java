package design.pattern;

public class ExtraCheese extends ToppingDecorator {

    BasePizza basePizza;

    ExtraCheese(BasePizza pizza){
        this.basePizza = pizza;
    }

    @Override
    public int cost(){
        return basePizza.cost() + 25;
    }
}
