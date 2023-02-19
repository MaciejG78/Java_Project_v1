package Labs.AppShapeCollector;

public interface Shape {

    default String shapeName() {
        return "Nieznana figura.";
    }

    double surfaceArea();
}
