public class CarElementPrintVisitor extends CarElementVisitor {

    @Override
    void visitBody(CarElement element) {
        Body body = (Body) element;
        body.printBody();
    }

    @Override
    void visitEngine(CarElement element) {
        Engine engine = (Engine) element;
        engine.printeEngine();
    }

    @Override
    void visitWheel(CarElement element) {
        Wheel wheel = (Wheel) element;
        wheel.printWheel();
    }

    @Override
    void visitCar(CarElement element) {
        Car car = (Car) element;
        car.printCar();
    }

}
