package person;

public class Student extends Person {
    double gpa;
    public Student(){

    }
    public Student(String name, int age, String address, double gpa){
        super(name, age, address);
        this.name = name;
        this.age = age;
        this.address = address;
        this.gpa = gpa;
    }
    public void setGpa(double gpa){
        this.gpa = gpa;
    }
    public double getGpa(){
        return gpa;
    }
    public void display(){
        super.display();
        System.out.println("GPA: " + gpa);
    }
}
