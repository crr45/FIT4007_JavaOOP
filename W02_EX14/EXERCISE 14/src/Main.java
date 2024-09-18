import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = sc.nextInt();

        int Total_Obb = 0;
        int Total_Even = 0;
        if (n % 2 != 0) {
            for (int i = 1; i <= n; i += 2) {
                Total_Obb += i;
            }
            System.out.println("Tổng số lẻ của " + n + " là: " + Total_Obb);
        }
        else {
            for (int i = 2; i <= n; i += 2) {
                Total_Even += i;
            }
            System.out.println("Tổng số chẵn của " + n + " là: " + Total_Even);
        }


    }
}