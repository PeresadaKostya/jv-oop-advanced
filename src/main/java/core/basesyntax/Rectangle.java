package core.basesyntax;

public class Rectangle extends Figure {
    private final double firstSide;
    private final double secondSide;

    public Rectangle(String color, double firstSide, double secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: "
                + getArea() + " sq.units, firstSide: "
                + firstSide + " sq.units, secondSide: "
                + secondSide + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }
}