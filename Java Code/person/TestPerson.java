package person;

public class TestPerson {
    public static void main(String[] args){
        Person p1 = new Student("Tuan", 21, "Bac Ly", 8);
        Person p2 = new Teacher("Nha", 35, "Dong Hoi", 2000);
        Person p3 = new Person("Tai", 21, "Duc Ninh");
        Person p4 = new Person();
        p4.setName("Duc");
        p4.setAge(21);
        p1.display();
        p2.display();
        p3.display();
        p4.display();
        String a = p4.getName();
        int b = p4.getAge();
        System.out.println("\n" + a + " " +b);
    }
}
