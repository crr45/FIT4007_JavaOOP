import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of elements: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Number of elements must be more than 0.");
            return;
        }

        System.out.println("Enter the numbers: ");
        int[] num = new int[n];
        for (int i = 0; i < n; i++){
            num[i] = sc.nextInt();
        }

        int max = num[0];
        int min = num[0];

        for (int i = 0; i < n; i++){
            if (num[i] > max){
                max = num[i];
            }
            if (num[i] < min){
                min = num[i];
            }
        }

        System.out.println("The maximum value is: " + max);
        System.out.println("The minimum value is: " + min);

    }
}