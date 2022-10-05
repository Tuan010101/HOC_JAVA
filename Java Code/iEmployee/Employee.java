package iEmployee;


public abstract class Employee implements IEmployee{
    String name;
    int paymentPerHour;
    public Employee(){

    }
    public Employee(String name, int paymentPerHour){
        this.name = name;
        this.paymentPerHour = paymentPerHour;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setPaymentPerHour(int paymentPerHour){
        this.paymentPerHour = paymentPerHour;
    }
    public int getPaymentPerHour(){
        return paymentPerHour;
    }
    public void display(){
        System.out.println("\nTen nv: " + name);
        System.out.println("So tien thanh toan tung gio: " + paymentPerHour + "$");
    }
}
