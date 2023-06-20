import java.util.Scanner;

public class Procedural {

	public static void main(String[] args) {
		//Ask the user to enter the desired calculation
		System.out.println("Enter number 0 to calculate the area of the Circle, Cylinder and sphere: ");
		System.out.println("Enter number 1 to calculate the volum of the Circle, Cylinder and sphere: ");
		// read the user's input
		Scanner in = new Scanner(System.in); // instantiate scanner object
		int choice = in.nextInt();
		double radius = 0; //initialize variable type double
		int hight = 0; //initialize variable type integer
		// add if else statement
		if (choice == 0) {
			System.out.println("Enter the radius & hight: ");
			// adding try catch statement to catch exceptions
			try {
				radius = in.nextDouble();
				hight = in.nextInt();
			} catch (Exception e) {
				System.err.println("ERROR");
			}

			System.out.println("The Circle's area is: " + calcArea(radius));
			System.out.println("The Sphere's area iS: " + calcAreasphere(radius));
			System.out.println("The Cylinder's area is: " + calcArea(radius) * +2 * Math.PI * radius * hight);
		} else if (choice == 1) {
			System.out.println("Enter radius & hight respictively: ");
			try {
				radius = in.nextDouble();
				hight = in.nextInt();
			} catch (Exception e) {
				System.err.println("ERROR");
			}

			System.out.println("The cylinder's volum is: " + calcArea(radius) * hight);
			double result = sphereVolum(radius);
			System.out.println("The sphere's volum is: " + result);
		} else {
			System.err.println("ERROR");
		}

	}

	//creating function to calculate the area of circle
	public static double calcArea(double radius) {
		return Math.PI * Math.pow(radius, 2);
	}
	//creating function to calculate the area of sphere
	public static double calcAreasphere(double radius) {
		return 4 * calcArea(radius);
	}
	//creating function to calculate the volume of sphere
	public static double sphereVolum(double radius) {
		return 3 / 4.0 * Math.PI * Math.pow(radius, 3);
	}

}
