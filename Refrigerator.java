public class Refrigerator {

    private Boolean hasWorkToDo;

    public void setHasWorkToDo(Boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood() {
        if (hasWorkToDo) {

            System.out.println("Pouring some milk...");
            hasWorkToDo = false;
        }
    }

}
