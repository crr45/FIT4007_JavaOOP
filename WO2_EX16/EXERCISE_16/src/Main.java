public class Main {
    public static void main(String[] args) {

        if (args.length < 2) {
            System.out.println("Please enter enough two coefficients A and B.");
            return;
        }

        float a = Float.parseFloat(args[0]);
        float b = Float.parseFloat(args[1]);

        if (a == 0){
            if (b == 0){
                System.out.println("The equation countless experiments");
            }
            else{
                System.out.println("The equation is invisible");
            }
        }else{
            float x = -b / a;
            System.out.println("The solution of equation x = " + x);
        }


    }
}