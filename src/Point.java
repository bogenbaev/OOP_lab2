public class Point {
    private int X;
    private int Y;

    public void setPoint(Point point) {
        this.X = point.X;
        this.Y = point.Y;
    }

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "X= " + X +
                ", Y=" + Y +
                "}";
    }
}
