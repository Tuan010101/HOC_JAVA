package iPizza;

public class PizzaClient {
    public static void main(String[]args){
        IShape s1 = new Cricle(3);
        IShape s2 = new Rectangle(3, 4);
        IShape s3 = new Pizza(30, s1) {
            @Override
            public double getArea() {
                return 0;
            }
        };

    }
}
