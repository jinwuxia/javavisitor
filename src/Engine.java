public class Engine extends CarElement{
    @Override
    public void accept(CarElementVisitor visitor) {
        visitor.visitEngine(this);
    }

    public void operateEngine() {
        System.out.println("operate engine.");
    }
    public void printeEngine() {
        System.out.println("print engine.");
    }
}
