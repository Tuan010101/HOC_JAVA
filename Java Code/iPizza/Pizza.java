package iPizza;

public abstract class Pizza implements IShape{
    double _price;
    IShape _shape;

    public Pizza(double _price, IShape _shape) {
        this._price = _price;
        this._shape = _shape;
    }

    public double get_price() {
        return _price;
    }

    public IShape get_shape() {
        return _shape;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "_price=" + _price +
                ", _shape=" + _shape +
                '}';
    }
}
