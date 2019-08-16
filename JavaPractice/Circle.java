import java.util.Scanner;

class Point {
        double x;
        double y;

        public void distance(Point p, Point c) {
            x = p.x;
            y = p.y;
            double sumx = Math.pow(x - y, 2);
            x = c.x;
            y = c.y;
            double sumy = Math.pow(x - y, 2);
            double sqrts = Math.sqrt((sumx + sumy));
            System.out.println(sqrts);
        }
    }

public class Circle extends Point {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Point c = new Point(); // Create a point center
        c.x = sc.nextDouble();
        c.y = sc.nextDouble();
        Point p = new Point(); // Create a point on circumference
        p.x = sc.nextDouble();
        p.y = sc.nextDouble();
        Circle c1 = new Circle(); // Create an object of class Circle
        c1.distance(c, p); // Calcualte radius of the circle

    }

    
}