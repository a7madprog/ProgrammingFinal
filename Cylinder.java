
public class Cylinder extends Circle { // cylinder subclass extends from circle superclass 
	private double hight; 
	// add constructor to initialize the cylinder object with parameters
	public Cylinder(double radius, double hight) {
		// call the superclass 
		super(radius);
		this.hight = hight;
	}
	//add default constructor that doesn't take parameters 
	public Cylinder() {
		super();
		hight = 1;
	}
	// add high getter 
	public double getHight() {
		return hight;
	}
	//add high setter 
	public void setHight(double hight) {
		this.hight = hight;
	}
	// calculate the volume of the cylinder  
	public double calcVolume() {
		// i used the superclass method to calculate the base area and multiply by height
		return hight * super.calcArea();

	}
	// override the superclass method to calculate the cylider's surface area
	public double calcArea() 
	{
		return 2 * super.calcArea() + 2 * Math.PI * getRadius() * hight;

	}
	// Calculate the volume of the sphere with the same radius as the cylinder
	public double calcVolsphere() {
		return 3 / 4.0 * Math.PI * Math.pow(getRadius(), 3);
	}
    // Calculate the surface area of the sphere with the same radius as the cylinder
	public double calcAreasphere() {
		return 4 * Math.PI * Math.pow(getRadius(), 2);
	}

}
