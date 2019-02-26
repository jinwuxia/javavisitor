import java.util.ArrayList;
import java.util.List;

public class Car extends CarElement {
    private final List<CarElement> elements = new ArrayList<>();

    public Car() {
        this.elements.add(new Wheel("front left"));
        this.elements.add(new Wheel("front right"));
        this.elements.add(new Wheel("back left"));
        this.elements.add(new Wheel("back right"));
        this.elements.add(new Body());
        this.elements.add(new Engine());
    }

    @Override
    public void accept(CarElementVisitor visitor) {
        visitor.visitCar(this);

    }

    public void operateCar() {

        System.out.println("operate car.");
    }
    public void printCar() {
        System.out.println("print car.");
    }

    public void getCar() {}

}
