public class Engine extends CarElement{
    @Override
    public void accept(CarElementVisitor visitor) {
        visitor.visitEngine(this);
    }

    public void operateEngine() {
        System.out.println("operate engine.");
    }

    public void printEngine() {
        System.out.println("print engine.");
    }

    public void getEngine() {}

}
