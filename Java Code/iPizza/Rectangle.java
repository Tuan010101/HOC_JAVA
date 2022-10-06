package iPizza;

public class Rectangle implements IShape{
    double _width;
    double _height;

    public Rectangle(double _width, double _height) {
        this._width = _width;
        this._height = _height;
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
