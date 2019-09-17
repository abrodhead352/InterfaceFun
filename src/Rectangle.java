import org.jetbrains.annotations.NotNull;

public class Rectangle implements Comparable<Rectangle>, Shape {
    private float width;
    private float length;
    Circle.Point center;

    public Rectangle(int x, int y, float width, float length) {
        this.width = width;
        this.length = length;
        this.center = new Circle.Point(x,y);
    }

    public Rectangle() {
        this.width = 1;
        this.length = 1;
        this.center = new Circle.Point(0,0);
    }

    @Override
    public double computePerimeter() {
        return 2*length + 2*width;
    }

    @Override
    public double computeArea() {
        return length*width;
    }

    @Override
    public int compareTo(Rectangle rectangle) {
        return (int) (this.computeArea()-rectangle.computeArea());
    }

    @Override
    public String toString() {
        return "Rectangle: Center = " + center + ", length = " + length + ", width = " + width;
    }
}
