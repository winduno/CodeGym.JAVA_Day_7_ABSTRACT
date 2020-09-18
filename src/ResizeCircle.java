public class ResizeCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(100);

        System.out.println(circle.getRadius());
        circle.resize(50);
        System.out.println(circle.getRadius());
    }
}
