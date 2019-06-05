package shapesexample;


public class Circle extends Shape {
    
    private Point point;
    private int radius;

    
    public Circle() {
    }

   
    public Circle(Point point, int radius) {
        this.point = point;
        this.radius = radius;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return 2*radius * Math.PI;
    }
    
    
    
    
    
    
    
}
