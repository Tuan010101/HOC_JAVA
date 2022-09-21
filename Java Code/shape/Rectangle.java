package shape;

public class Rectangle extends Shape{
    double width;
    double length;

    public Rectangle(String name, double witdth, double length){
        super(name);
        this.width = witdth;
        this.length = length;
    }

    @Override
    double calculateArea() {
        return this.width*this.length;
    }
}
