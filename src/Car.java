import java.util.ArrayList;
import java.util.List;

public class Car implements CarElement {
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
        for (CarElement element : elements) {
            element.accept(visitor);
        }
        visitor.visit(this);
    }
}
