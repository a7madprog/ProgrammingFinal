import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// ask the user to enter the desired calculation 
		System.out.println("Enter number 0 to calculate the area of the Circle, Cylinder and sphere: ");
		System.out.println("Enter number 1 to calculate the volum of the Circle, Cylinder and sphere: ");
		// initialize variables 
		Scanner in = new Scanner(System.in);
		int choice = in.nextInt();
		double radius = 0;
		double hight = 0;
		// add if else statement 
		if (choice == 0)

		{
			// add try catch statement to catch exception 
			System.out.println("Enter the radius & hight: ");
			try {

				Circle c1 = new Circle(radius = in.nextDouble()); // Instantiate an object from Circle class  
				Cylinder cy1 = new Cylinder(c1.getRadius(), hight = in.nextInt()); // Instantiate an object from Cylinder class  
				System.out.println("The Circle's area is: " + c1.calcArea()); // print circle's area
				System.out.println("The Sphere's area iS: " + cy1.calcAreasphere());//print sphere's area
				System.out.println("The Cylinder's area is: " + cy1.calcArea());// print cylinder area
			} catch (Exception e) {
				System.err.println("ERROR");
			}
			
		} else if (choice == 1)

		{
			try {
				System.out.println("Enter radius & hight respictively: ");
				Cylinder cy1 = new Cylinder(radius = in.nextDouble(), hight = in.nextDouble()); // Initialize new object  
				System.out.println("The cylinder's volum is: " + cy1.calcVolume());
				System.out.println("The sphere's volum is: " + cy1.calcVolsphere());
			} catch (Exception e) {
				System.err.println("ERROR");
			}

		} else {
			System.out.println("Error");
		}

	}

}
