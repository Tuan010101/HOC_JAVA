package iPizza;

public class Pizza{
    double _price;
    IShape _shape;

    public Pizza(double p, IShape s) {
        this._price = p;
        this._shape = s;
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
                "price =" + _price +
                ", shape =" + _shape +
                ", area = " + Math.round(_shape.getArea()*100.0)/100.0 +
                '}';
    }
}
