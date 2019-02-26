public class CarElementDoVisitor extends CarElementVisitor {
    @Override
    void visitBody(Body element) {
        element.operateBody();
    }

    @Override
    void visitEngine(Engine element) {
        element.operateEngine();
    }

    @Override
    void visitWheel(Wheel element) {
        element.operateWheel();
    }

    @Override
    void visitCar(Car element) {
        element.operateCar();
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
