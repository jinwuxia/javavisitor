public abstract class CarElementVisitor {
    abstract void visitBody(CarElement element);
    abstract void visitEngine(CarElement element);
    abstract void visitWheel(CarElement element);
    abstract void visitCar(CarElement element);

    //void visit(Body body);
    //void visit(Car car);
    //void visit(Engine engine);
    //void visit(Wheel wheel);
}
