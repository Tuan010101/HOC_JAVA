package person;

public class Person {
    String name;
    int age;
    String address;
    public Person(){

    }
    public Person(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getAddress(){
        return address;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setAddress(String address){
        this.address = address;
    }

    public void display(){
        System.out.println("\nTen: " + name);
        System.out.println("Tuoi: " + age);
        System.out.println("Dia chi: " + address);
    }
}
