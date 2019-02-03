public class VisitorDemo {
    public static void main(final String[] args) {
        Body body = new Body();
        Engine engine = new Engine();
        Wheel wheel = new Wheel("front");
        CarElement car = new Car();

        body.accept(new CarElementDoVisitor());
        engine.accept(new CarElementDoVisitor());
        wheel.accept(new CarElementDoVisitor());
        car.accept(new CarElementDoVisitor());

        body.accept(new CarElementPrintVisitor());
        engine.accept(new CarElementPrintVisitor());
        wheel.accept(new CarElementPrintVisitor());
        car.accept(new CarElementPrintVisitor());

    }
}