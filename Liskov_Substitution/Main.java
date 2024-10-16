package Liskov_Substitution;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(10, 5);
        System.out.println("Rectangle Area: " + rectangle.getArea());

        Shape square = new Square(5);
        System.out.println("Square Area: " + square.getArea());
    }
}
