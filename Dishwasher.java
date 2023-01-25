public class Dishwasher {

    private Boolean hasWorkToDo;

    public void setHasWorkToDo(Boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes() {
        if (hasWorkToDo) {

            System.out.println("Cleaning some cups...");
            hasWorkToDo = false;
        }

    }
}
