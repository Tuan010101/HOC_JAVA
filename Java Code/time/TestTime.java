package time;

public class TestTime {
    public static void main(String[]args){
        Time tg1 = new Time(24,60,60);
        try{
            tg1.display();
            for(int i = 1; i<=5; i++){
                tg1.nextSecond();
                tg1.display();
            }
            for(int i = 1; i<=5; i++){
                tg1.previousSecond();
                tg1.display();
            }
        }catch (Exception ex){
            System.out.println("Error");
        }
    }
}
