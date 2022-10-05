package iEmployee;

public class FullTimeEmployee extends Employee{
    public  FullTimeEmployee(String name, int paymentPerHours){
        super(name, paymentPerHours);
    }

    @Override
    public int calculateSalary() {
        return paymentPerHour * 8;
    }
    public void display(){
        super.display();
        System.out.println(name + " la nhan vien full time");
        System.out.println("Luong: " + calculateSalary() + "$");
    }
}
