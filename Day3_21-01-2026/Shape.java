
abstract class ShapeArea {

    abstract void area(double a);

    // void ab() {
    //     System.out.println("A");
    // }
}

class Circle extends ShapeArea {

    @Override
    void area(double r) {
        System.out.println("Area of the Circle : " + 3.14 * r * r);
    }
}

class Square extends ShapeArea {

    @Override
    void area(double si) {
        System.out.println("Area of the Square : " + si * si);
    }
}

public class Shape {

    public static void main(String[] args) {
        ShapeArea c = new Circle();
        ShapeArea s = new Square();
        c.area(2);
        s.area(4);
    }
}
