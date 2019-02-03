public class CarElementDoVisitor extends CarElementVisitor {
    @Override
    void visitBody(CarElement element) {
        Body body = (Body) element;
        body.operateBody();
    }

    @Override
    void visitEngine(CarElement element) {
        Engine engine = (Engine) element;
        engine.operateEngine();
    }

    @Override
    void visitWheel(CarElement element) {
        Wheel wheel = (Wheel) element;
        wheel.operateWheel();
    }

    @Override
    void visitCar(CarElement element) {
        Car car = (Car) element;
        car.operateCar();
    }

    /*
    public void visit(Body body) {
        body.operateBody();
    }

    @Override
    public void visit(Car car) {
        car.operateCar();
    }

    @Override
    public void visit(Wheel wheel) {
        wheel.operateWheel();
    }

    @Override
    public void visit(Engine engine) {
        engine.operateEngine();
    }
    */
}
