public class CoffeeMaker {

    private Boolean hasWorkToDo;

    public void setHasWorkToDo(Boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee() {

        if (hasWorkToDo) {

            System.out.println("Brewing some hot coffee...");
            hasWorkToDo = false;
        }

    }

}
