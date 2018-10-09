package ex_Points;

import java.util.ArrayList;
import java.util.List;

public class ex_Points {

    public static void main (String [] args) {
        List<Point> points = new ArrayList<>();
        points.add(new Point(4, 8));
        points.add(new ColouredPoint(1, 1, "green"));
        points.add(new ColouredPoint(2, 5, "blue"));
        points.add(new threeDimensionalPoint(5, 2, 8));
        points.add(new Point(0, 0));

        for (Point point : points) {
            System.out.println(point);
        }
    }
}
