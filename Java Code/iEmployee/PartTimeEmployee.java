package iEmployee;

public class PartTimeEmployee extends Employee{
    int workingHours;
    public PartTimeEmployee(String name, int paymentPerHours, int workingHours){
        super(name, paymentPerHours);
        this.workingHours = workingHours;
    }

    @Override
    public int calculateSalary() {
        return paymentPerHour * workingHours;
    }
    public void display(){
        super.display();
        System.out.println("So gio lam: " + workingHours);
        System.out.println(name + " la nhan vien part time");
        System.out.println("Luong: " + calculateSalary() + "$");
    }
}
