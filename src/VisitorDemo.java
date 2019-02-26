public class VisitorDemo {
    public static void main(final String[] args) {
        Body body = new Body();
        Engine engine = new Engine();
        Wheel wheel = new Wheel("front");
        CarElement car = new Car();

        CarElementVisitor visitor1 = new CarElementDoVisitor();
        body.accept(visitor1);
        engine.accept(visitor1);
        wheel.accept(visitor1);
        car.accept(visitor1);

        CarElementVisitor visitor2 = new CarElementPrintVisitor();
        body.accept(visitor2);
        engine.accept(visitor2);
        wheel.accept(visitor2);
        car.accept(visitor2);

    }
}