public class Body extends CarElement {
    @Override
    public void accept(CarElementVisitor visitor) {
        visitor.visitBody(this);
    }

    public void operateBody() {
        System.out.println("operate body");
    }
    public void printBody() {
        System.out.println("print body.");
    }
}
