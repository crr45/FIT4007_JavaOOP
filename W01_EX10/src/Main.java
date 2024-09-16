public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        int number = 0;


        while (count < 10) {
            if (number % 2 == 0) {
                sum += number;
                count++;
            }
            number++;
        }


        System.out.println("Tổng của 10 số chẵn đầu tiên là: " + sum);
    }
}