package iPizza;

public abstract class PizzaDeal extends Pizza {
    public PizzaDeal(double _price, IShape _shape) {
        super(_price, _shape);
    }

    public double deal(Pizza p){
        return p._price/p.getArea();
    }
    public boolean betterDeal(Pizza p1, Pizza p2){
        if(deal(p1) > deal(p2))
            return true;
        else return false;
    }
}
