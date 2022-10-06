package iPizza;

public class Cricle implements IShape{
    double _radius;

    public Cricle(double _radius) {
        this._radius = _radius;
    }

    @Override
    public double getArea() {
        return Math.PI * _radius * _radius;
    }

    @Override
    public String toString() {
        return "Cricle{" +
                "_radius=" + _radius +
                '}';
    }
}
