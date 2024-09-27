package Rectangle;

public class Rectangle {

    private double length;
    private double width;

    public Rectangle(double length, double width){
            this.length = length;
            this.width = width;
        }

        public double getLength(){
            return length;
        }

        public void setHeight(){
            this.length = length;
        }

    public double getWidth() {
        return width;
    }

    public void setWidth(){
        this.width = width;
    }

    public double getArea(){
        return length * width;
    }

    public double getRectangular(){
        return 2 * (length + width);
    }


    public String toString() {
        return "Area = " + getArea() + "\n" +
                "Rectangular = "+ getRectangular();
    }
}