//  Method OverLoad

public class Calculator {

    public void add(int a, int b) {
        System.out.println("Integer 2 : " + (a + b));
    }

    public void add(int a, int b, int c) {
        System.out.println("Integer 3 : " + (a + b + c));
    }

    public void add(double a, double b) {
        System.out.println("Double  : " + (a + b));
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.add(10, 20, 30);
        c.add(10, 20);
        c.add(10.0, 20);
    }

}
