package point;

/*
 * advanced programming, 2022B
 * EX02: a program that does mathematical equations on one or more points
 * Written by: Saliba Rishmawi
 * ID: 22011168
 */

// Class tester to test the methods in Point class

public class Tester {
	public static void main(String[] args) {
		Point p1 = new Point(-3, 5);
		Point p2 = new Point();
		p2.setX(-7);
		p2.setY(-3);

		System.out.println("Print p1 = " + p1.toString());
		System.out.println("Print p2 = " + p2.toString());
		System.out.println("The Distance between X and Y is: " + p1.distance(p1));
		System.out.println("Does X = Y? " + p1.equals(p1));
		p1.move(4, 2);
		System.out.println("p1 after moving X and Y is: " + p1.toString());
		System.out.println("The half way point between p1 and p2 is = " + p1.getPointInHalfWay());
		System.out.println(p1.LineEquation(p1.getX(), p1.getY(), p2.getX(), p2.getY()));
	}
}
