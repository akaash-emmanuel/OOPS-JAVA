import java.util.Scanner;
import java.lang.Math;
import java.util.concurrent.Callable;

class Circle2D {
    double x = 0.0;
    double y = 0.0;
    double radius = 1.0;
    public Circle2D() {
        //default constructor
    }

    public Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    void choice() {
        Scanner in = new Scanner(System.in);
        System.out.println("Would you like to:\n1. Make your own circle.\n2. Use default circle with centre (1.0,1.0) and radius 1 unit");
        Integer input = in.nextInt();
        if (input == 1){
            initialize();
            getPerimeter();
            getArea();
            testContains();
            testOverlaps();

        }
        else if (input == 2){
            System.out.println("You have chosen the default circle");
            getPerimeter();
            getArea();
            testContains();
            testOverlaps();

        }
        else{
            System.out.println("Choose a valid option");
        }
    }
    void initialize(){
        Scanner in = new Scanner(System.in);
        System.out.println("Write the x-coordinate for the centre of your circle");
        double x1 = in.nextDouble();
        System.out.println("Write the y-coordinate for the centre of your circle");
        double y1 = in.nextDouble();
        System.out.println("Write the radius of your circle");
        double rad = in.nextDouble();
        System.out.println("Your circle's centre is at ("+x1+","+y1+") and its radius is "+rad+"units");
        x = x1;
        y = y1;
        radius = rad;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public double getRadius(){
        return radius;
    }
    void getPerimeter(){
        double peri = 2*Math.PI*radius;
        System.out.println("The perimeter is:\t"+peri);
    }
    void getArea(){
        double area = Math.PI*radius*radius;
        System.out.println("The area is:\t"+area);
    }
boolean contains(double x, double y){
    double distance = Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
    return distance <= radius;
}

boolean contains(Circle2D circle){
    double distance = Math.sqrt(Math.pow(circle.x - this.x, 2) + Math.pow(circle.y - this.y, 2));
    return distance + circle.radius <= radius;
}

boolean overlaps(Circle2D circle){
    double distance = Math.sqrt(Math.pow(circle.x - this.x, 2) + Math.pow(circle.y - this.y, 2));
    return distance < radius + circle.radius && distance > Math.abs(radius - circle.radius);
}

void testContains(){
    System.out.println("c1.contains(3,3):"+contains(3,3));
    Circle2D circle2 = new Circle2D(2,2, 5.5);
    System.out.println("c1.contains(circle2(2,2,5.5)):"+contains(circle2));
    }

    void testOverlaps(){
        Circle2D circle3 = new Circle2D(3, 5, 2.3);
        System.out.println("c1.overlaps(circle3(3,5,2.3)):"+overlaps(circle3));
}

}

public class Main2 {
    public static void main(String[] args){
Circle2D c1  = new Circle2D();
c1.choice();

double centerX = c1.getX();
double centerY = c1.getY();
double circleRadius = c1.getRadius();

        System.out.println("Center: (" +centerX+","+centerY+")");
        System.out.println("Circle radius: " + circleRadius);
    }
}