package shapesexample;


public class Square extends Shape {
    
    private int x;

    
    
    public Square() {
    }

    
    public Square(int x) {
        this.x = x;
    }
    
    
    public int getX(){
        return x;
    }
    
    public void setX(int pleura){
        x = pleura;
    }

    @Override
    public double getArea() {
        return x*x ;
    }

    @Override
    public double getPerimeter() {
        return 4*x;
    }
}
