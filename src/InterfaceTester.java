import java.util.Arrays;

public class InterfaceTester {
    public static void main(String[] args) {
        System.out.println("Output 1: " + "zags".compareTo("apple"));
        System.out.println("Output 2: " + "zags".compareTo("Zags"));
        System.out.println("Output 3: " + "zags".compareTo("zigs"));
        System.out.println("Output 4: " + "zags".compareTo("zags"));
        System.out.println("Output 5: " + "zags".equals("zags"));
        System.out.println("Output 6: " + "zags".equals("Zags"));
        Circle myCircle = new Circle();
        System.out.println("Output 7: " + myCircle.equals(myCircle));
        //1) returns the difference in ASCII values for the first string - the second string
            //returns <0 when invoking object is < then the arg object, >0 if invoking > arg, 0 if they are the same
        //2) sorting
        //3) returns a boolean whether the strings are the same value-wise
            //java compiler puts new references to the same value string to the same string object
        //4) returns the boolean whether the references are the same
        //5) comparing to object references to see if they refer to the same object
        //6) compile error, we need to implement Comparable or make a compareTo method

        System.out.println("Output 8: " + myCircle.equals(new Circle()));
        System.out.println("Output 9: " + myCircle.compareTo(myCircle));
        //interface: a set of methods that a class promises to implement
        //java provides a Comparable interface -- interfaces generally named x'able
        Comparable myComparable = myCircle;

        //we can define our own interfaces


        Shape myShape = myCircle;/*
        System.out.println(myShape.computeArea());
        System.out.println(myShape.computePerimeter());
        */
        //with comparable, we can now sort circles

        Circle[] circles = new Circle[5];
        for(int i = 0; i < 5; i++) {
            circles[i] = new Circle(i,i,5-i);
        }
        System.out.println(Arrays.toString(circles));
        Arrays.sort(circles);
        System.out.println(Arrays.toString(circles));

        //task: define a rectangle that is also a shape
        //make an array of shape references with some circles, some rectangles
        Shape shapes[] = new Shape[6];
        for(int i = 0; i < 3; i++) {
            shapes[i] = new Circle(i,i,i);
        }

        for(int i = 3; i < 5; i++) {
            shapes[i] = new Rectangle(i,i,i,i);
        }

        shapes[5] = new Shape() { //represents a 5x5 square
            @Override
            public double computePerimeter() {
                return 20;
            }

            @Override
            public double computeArea() {
                return 25;
            }

            @Override
            public String toString() {
                return "Square: 5x5";
            }
        };

        for(Shape s: shapes) {
            System.out.println(s);
            System.out.println(s.computeArea());
            System.out.println(s.computePerimeter());
            System.out.println("");
        }
    }
}
