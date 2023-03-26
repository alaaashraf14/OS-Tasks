package Task1;
public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int w, int h) { 
        this.width = w;
        this.height = h;
    }

    public int area() {
        return width * height;
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4, 5);
        Rectangle r2 = new Rectangle(8, 3);

        System.out.println("Area of r1: " + r1.area());
        System.out.println("Area of r2: " + r2.area());
    }
}
