import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer");

        int number = sc.nextInt();

        if (number == 0){
            System.out.println("The imported number is zero");
            return;
        }

        if (number % 2 == 0){
            System.out.println("The number " + number + " is even");
        }
        else{
            System.out.println("The number " + number + " is obb");
        }
    }
}