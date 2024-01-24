public class Main {
    public static void main(String args[]) {  
        Shape blueShape = new Shape();
        Shape redShape = new Shape("Red");

        Rectangle rectangle = new Rectangle("Green", 5, 8);
        Square square = new Square("Yellow", 4);

        Ellipse ellipse = new Ellipse("Purple", 2, 3);
        Circle circle = new Circle("Orange", 1, 1);

        ellipse.print(ellipse);
        // in Java, when you use System.out.println(object), it implicitly calls the toString() method of the object being passed
        System.out.println(circle); 

        System.out.println("Area of square: " + square.area());
        System.out.println("Center of ellipse: " + ellipse.getCenter());

        ArrayList<Shape> sequence = new ArrayList<>(Arrays.asList(blueShape, redShape, rectangle, square, ellipse, circle));
        for(Shape s : sequence) {
            System.out.println(s);
        }
    }
}

public class Shape extends Object {
    private String color; // encapsulation, we don't want subclasses to reach to variables that easly; accessor methods are for that

    public Shape() {
        this.color = "Blue";
    }
    public Shape(String color) {
        super(); // this is automatically called when not written; the superclass of shape is the superclass of all classes, Object
        this.color = color;
    }
    public void print(Shape s) { // each shape can use this method
        System.out.println("I'm a shape with no purpose");
    }
    @Override
    public String toString() { 
        return "Shape[color = " + color + "]";
    }
}

public class Rectangle extends Shape {
    private int length;
    private int width;

    public Rectangle(String color, int length, int width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    public int area() {
        return length * width;
    }
}

public class Square extends Rectangle {
    public Square(String color, int length, int width) {
        super(color, length, width);
    }
}

public class Ellipse extends Shape {
    private int center;
    private int avarageRadious;

    public Ellipse(String color, int center, int avarageRadious) {
        super(); // this calls the defualt superclass 
        this.center = center;
        this.avarageRadious = avarageRadious;
    }
    public int getCenter() { 
        return center;
    }
}

public class Circle extends Ellipse {
    public Circle(String color, int center, int avarageRadious) {
        super(color, center, avarageRadious);
    }
}