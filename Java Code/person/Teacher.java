package person;

public class Teacher extends Person {
    int salary;
    public Teacher(){

    }
    public Teacher(String name, int age, String address, int salary){
        this.name = name;
        this.age = age;
        this.address = address;
        this.salary = salary;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public int getSalary(){
        return salary;
    }
    public void display(){
        super.display();
        System.out.println("Salary: " + salary + "$");
    }
}
