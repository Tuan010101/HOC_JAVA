import java.util.Scanner;

public class TinhTong {
    public static void main(String[] args) {
        int n, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n: ");
        n = sc.nextInt();
        for(int i = 1; i <= n; ++i)
        {
            sum += i;
        }
        System.out.println("Tổng các số tự nhiên từ 1 đến "+ n +" là: "+sum);
    }
}
