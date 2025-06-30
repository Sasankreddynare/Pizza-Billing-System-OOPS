public class DeluxePizza extends Pizza{
    DeluxePizza(Boolean veg){
        super(veg);
      //these will added automatically now
        super.addExtraCheese();
        super.addExtraToppings();
    }
    @Override
    public void addExtraCheese(){

    }
    @Override
    public void addExtraToppings(){

    }
}
