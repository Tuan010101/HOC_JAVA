package iPizza;

public class PizzaClient {
    public static void main(String[]args){
        Pizza p1 = new Pizza(10, new Cricle(3.5));
        Pizza p2 = new Pizza(10, new Rectangle(5 , 10));
        PizzaDeal compare = new PizzaDeal();
        System.out.println("Pizza 1: " + p1);
        System.out.println("Pizza 2: " + p2);
        System.out.println("Pizza 1 có deal tốt hơn Pizza 2: " + compare.betterDeal(p1, p2));
    }
}
