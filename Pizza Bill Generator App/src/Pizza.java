public class Pizza {
    private int price;
    //as it is boolean if false - nonveg
    private Boolean veg;

    private int extraCheesePrice =100;
    private int extraToppingsPrice =150;
    private int backPackPrice=20;

    int basePizzaPrice;
    boolean isExtraCheeseAdded=false;
    boolean isExtraToppingsAdded=false;
    boolean isOptedForTakeAway=false;


    public Pizza(Boolean veg){
        this.veg=veg;
        if(this.veg){
            this.price=300;
        }else{
            this.price=400;
        }
        basePizzaPrice=this.price;
    }
    public void addExtraCheese(){
        isExtraCheeseAdded=true;

        this.price+=extraCheesePrice;
    }
    public void addExtraToppings(){
        isExtraToppingsAdded=true;

        this.price+=extraToppingsPrice;

    }
    public void takeAway(){
        isOptedForTakeAway=true;

        this.price+=backPackPrice;

    }
    public void getBill(){
        String bill="";
        System.out.println("Pizza: "+basePizzaPrice);
        if(isExtraCheeseAdded){
            bill+= "Extra Cheese added: "+extraCheesePrice+ "\n";
        }
        if(isExtraToppingsAdded){
            bill+= "Extra Toppings added: "+extraToppingsPrice+ "\n";
        }
        if(isOptedForTakeAway){
            bill+= "Take away: "+backPackPrice+ "\n";
        }
        bill += "Bill: "+this.price + "\n";
        System.out.println(bill);

    }
}
