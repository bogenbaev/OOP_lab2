public class Rectangle extends Shape {
    Point point1;
    Point point2;
    int xCenter;
    int yCenter;
    public Rectangle(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    @Override
    public double getArea(){
        return (point1.getX() - point2.getX()) * (point1.getY() - point2.getY());
    }

    @Override
    public double getLength(){
        return 2 * ((point1.getX() - point2.getX()) + (point1.getY() - point2.getY()));
    }

    public double getDistanceTo(Rectangle anotherRectangle){
        xCenter = (point1.getX() + point2.getX())/2;
        yCenter = (point1.getY() + point2.getY())/2;
        return Math.sqrt(Math.pow(xCenter - anotherRectangle.xCenter,2) + Math.pow(yCenter -anotherRectangle.yCenter, 2));
    }


    @Override
    public String toString() {
        return "Rectangle{" +
                "point1=" + point1.getX() + " " + point1.getY() +
                ", point2=" + point2.getX() + " " + point2.getY() +
                '}';
    }
}

