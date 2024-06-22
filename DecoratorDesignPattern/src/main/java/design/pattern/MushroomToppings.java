package design.pattern;

public class MushroomToppings extends  ToppingDecorator{
    BasePizza basePizza;

    public  MushroomToppings(BasePizza pizza){
        this.basePizza = pizza;
    }

    @Override
    public int cost(){
        return this.basePizza.cost() +  15;
    }
}
