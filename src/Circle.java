public class Circle extends Shape {
    int radius;
    Point point;
    public Circle(Point point, int radius) {
        this.point = point;
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getLength() {
        return 2 * Math.PI * radius;
    }

    public double getDistanceTo(Circle anotherCircle) {
        return Math.sqrt(Math.pow(anotherCircle.point.getX() - this.point.getX(), 2) +
                Math.pow(anotherCircle.point.getY() - this.point.getY(), 2));
    }

    @Override
    public String toString() {
        return "Circle{" +
                "X = " + this.point.getX() +
                ", Y = " + this.point.getY() +
                ", radius = " + radius +
                "}";
    }
}
