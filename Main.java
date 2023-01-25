public class Main {

    public static void main(String[] args) {

        SmartKitchen theKitchen = new SmartKitchen();

        theKitchen.getDishwasher().setHasWorkToDo(true);
        theKitchen.getCoffeeMaker().setHasWorkToDo(true);
        theKitchen.getRefrigerator().setHasWorkToDo(true);
        
        theKitchen.getCoffeeMaker().brewCoffee();
        theKitchen.getRefrigerator().orderFood();
        theKitchen.getDishwasher().doDishes();

        theKitchen.doKitchenWork();

    }

}