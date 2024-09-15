public class Main {
    public static void main(String[] args) {
        int a = 7, i, sum = 0;
        for (i = 7; i <= 100; i+=7){
            if (i % 7 == 0)
                sum += i;
        }
        System.out.println(sum);

    }
}