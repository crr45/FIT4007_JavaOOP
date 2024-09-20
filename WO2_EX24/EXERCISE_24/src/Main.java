import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number N:");
        int N = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= N; i++){
            System.out.println("Enter integer: ");
            int number = sc.nextInt();
            sum += number;
        }

        System.out.println("The total integer is " + sum);
    }
}