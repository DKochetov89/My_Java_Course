import java.util.Objects;

public class CloneTesting {

    public static void main(String[] args) {
        Point1 point11 = new Point1(0, 0);
        try {
            Object point12 = point11.clone();
            System.out.println(point11);
            System.out.println(point12);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        Point2 point21 = new Point2();
        point21.x = 10; point21.y = 12;
        Object point22 = point21.clone();
        System.out.println(point21);
        System.out.println(point22);
    }
}
class Point1 implements Cloneable
{
    int x;
    int y;

    public Point1(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point1)) return false;
        Point1 point1 = (Point1) o;
        return x == point1.x && y == point1.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}

class Point2
{
    int x;
    int y;

    public Object clone()
    {
        Point2 point2 = new Point2();
        point2.x = this.x;
        point2.y = this.y;
        return point2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point2)) return false;
        Point2 point2 = (Point2) o;
        return x == point2.x && y == point2.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}