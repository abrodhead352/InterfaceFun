import org.jetbrains.annotations.NotNull;

public class Circle implements Comparable<Circle>{
    //<T> is a generic type (parameterized)
    Point center;
    double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Circle(int x, int y, double radius) {
        this.center = new Point(x,y);
        this.radius = radius;
    }

    public Circle() {
        this.center = new Point(0,0);
        this.radius = 1;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Center = " + center + ", radius = " + radius;
    }
    //Notes
    //nested classes -- classes defined inside a class
    //outer class -- not nested, can be public or package private(not protected/private)
    //nested class -- 4 types:
    //  1. static nested class -- (we will make point a static nested class of circle)
    //  2. non-static nested class(inner class)
    //  3. local inner class -- non-static-nested defined inside a method
    //  4. anonymous inner class (local inner class without a name)

    //static so we don't need a circle instance to make a point instance
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

    @Override
    public int compareTo(Circle o) {
        //invoking reference is 'this'
        //argument reference is 'o'
        if(this.radius < o.radius) {
            return -1;
        } else if(this.radius > o.radius) {
            return 1;
        }
        return 0;
    }
}
