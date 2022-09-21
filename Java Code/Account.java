public class Account {
    int id;
    String name;
    int balance;
    public Account(int id,String name){
        this.id = id;
        this.name = name;
        this.balance = 0;
    }
    public Account(int id,String name,int balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    void display(){
        System.out.println("STK: " + id + ", Name: " + name + ", Balance: " + balance + "$");
    }
    void deposit(int amount){
        this.balance += amount;
        System.out.println("Nap tien: So du cua " + this.name + " la: " + this.balance + "$");
    }
    void withdraw(int amount){
        if (amount <= this.balance){
            this.balance -= amount;
            System.out.println("Rut tien: So du cua " + this.name + " la: " + this.balance + "$");
        }else{
            System.out.println("Rut tien: So du cua " + this.name + " khong du!");
        }
    }
    public static void main(String[]args){
        Account tk1 = new Account(1,"Tuan");
        Account tk2 = new Account(2,"Duc",100);
        tk1.display();
        tk2.display();
        tk1.deposit(200);
        tk1.withdraw(300);
        tk2.deposit(500);
        tk2.withdraw(200);
        tk1.display();
        tk2.display();
    }
}
