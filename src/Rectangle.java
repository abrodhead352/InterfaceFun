import org.jetbrains.annotations.NotNull;

public class Rectangle implements Comparable<Rectangle>, Shape {
    private float width;
    private float length;
    Point center;

    public static class Point {

        int x,y;

        public Point() {
            x = 0;
            y = 0;
        }

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "(" + x +", "+ y + ")";
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

    }

    public Rectangle(int x, int y, float width, float length) {
        this.width = width;
        this.length = length;
        this.center = new Point(x,y);
    }

    public Rectangle() {
        this.width = 1;
        this.length = 1;
        this.center = new Point(0,0);
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
