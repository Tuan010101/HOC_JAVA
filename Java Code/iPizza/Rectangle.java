package iPizza;

public class Rectangle implements IShape{
    double _width;
    double _height;

    public Rectangle(double w, double h) {
        this._width = w;
        this._height = h;
    }

    @Override
    public double getArea() {
        return _height*_width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "_width=" + _width +
                ", _height=" + _height +
                '}';
    }
}
