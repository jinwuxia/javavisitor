public class CarElementPrintVisitor extends CarElementVisitor {

    @Override
    void visitBody(Body element) {
        element.printBody();
    }

    @Override
    void visitEngine(Engine element) {
        element.printEngine();
    }

    @Override
    void visitWheel(Wheel element) {
        element.printWheel();
    }

    @Override
    void visitCar(Car element) {
        element.printCar();
    }

}
