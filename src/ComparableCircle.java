import java.util.Comparator;

public class ComparableCircle implements Comparator<Circle> {

    public ComparableCircle() {
    }

//    public ComparableCircle(double radius) {
//        super(radius);
//    }
//
//    public ComparableCircle(double radius, String color, boolean filled) {
//        super(radius, color, filled);
//    }

    public int compare(Circle c1, Circle c2) {
        if (c1.getRadius() > c2.getRadius()) return 1;
        else if (c1.getRadius() < c2.getRadius()) return -1;
        else return 0;
    }
}