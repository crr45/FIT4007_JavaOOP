import Rectangle.Rectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length: ");
        double length = sc.nextFloat();
        System.out.println("Enter the width: ");
        double width = sc.nextFloat();;

        Rectangle rectangle = new Rectangle(length, width);
        System.out.println(rectangle.toString());
    }
}
