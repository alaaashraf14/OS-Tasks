public class Circle {
     private double radius;
     private String color;

    public Circle() {
        radius = 1.0;
        color = "red";
    }

    public Circle(double radius) {
        this.radius = radius;
        color = "red";
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle();
        

        System.out.println("Circle 1: radius = " + circle1.getRadius() + ", area = " + circle1.getArea());
        
    }
}