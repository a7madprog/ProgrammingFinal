
public class Circle {
	private double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public Circle() {
		super();
		radius = 1;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double calcArea() {
		return Math.PI * (Math.pow(radius, 2));
	}

}
