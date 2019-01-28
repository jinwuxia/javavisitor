public class VisitorDemo {
    public static void main(final String[] args) {
        CarElement car = new Car();

        car.accept(new CarElementPrintVisitor());
        car.accept(new CarElementDoVisitor());
    }
}