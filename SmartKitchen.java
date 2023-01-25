public class SmartKitchen {
    
    private CoffeeMaker coffeeMaker;
    private Dishwasher dishWasher;
    private Refrigerator refrigerator;

    public SmartKitchen(){

        coffeeMaker = new CoffeeMaker();
        dishWasher = new Dishwasher();
        refrigerator = new Refrigerator();

    }

    public CoffeeMaker getCoffeeMaker(){
        return coffeeMaker;
    }

    public Dishwasher getDishwasher(){
        return dishWasher;
    }

    public Refrigerator getRefrigerator(){
        return refrigerator;
    }


    private void addWater() {
        coffeeMaker.brewCoffee();
    }

    private void pourMilk() {
        refrigerator.orderFood();
    }

    private void loadDishwasher() {
        dishWasher.doDishes();
    }

    public void doKitchenWork(){
        addWater();
        pourMilk();
        loadDishwasher();
    }

}
