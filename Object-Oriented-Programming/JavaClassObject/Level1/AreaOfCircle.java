package Level1;

class Circle{
    //Attribute
    int radius;

    //Constructor
    Circle(int radius){
        this.radius = radius;
    }

    //method to calculate area of circle
    double displayArea(){
        double areaOfCircle = 3.14 * radius * radius;
        return areaOfCircle;
    }

    //method to display circumference of circle
    double displayCircumference(){
        double circumferenceOfCircle = 2 * 3.14 * radius;
        return circumferenceOfCircle;
    }
}

public class AreaOfCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(34);

        System.out.println("Area of Circle is: " + circle.displayArea());

        System.out.println("Circumference of Circle is: " + circle.displayCircumference());
    }
}
