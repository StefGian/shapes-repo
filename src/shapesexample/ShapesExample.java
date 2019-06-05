package shapesexample;

import static java.nio.file.Files.list;
import static java.rmi.Naming.list;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;

public class ShapesExample {

    public static void main(String[] args) {

        Square s1 = new Square(5);
        double s1Perimeter = s1.getPerimeter();
        System.out.println("s1 perimeter is: " + s1Perimeter);

        double s1Area = s1.getArea();
        System.out.println("s1 area is: " + s1Area);

        Point p1 = new Point(2, 2);
        Circle c1 = new Circle(p1, 5);

        List<Shape> list = new ArrayList();

        list.add(s1);

        list.add(c1);

        for (Shape x : list) {
            System.out.println(x.getPerimeter());
            System.out.println(x.getArea());
        }

    }

}
