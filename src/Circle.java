
public class Circle {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double area() {
		return (double) Math.PI * radius * radius;
	}

	public double circumference() {
		return (double) Math.PI * 2 * radius;
	}

	public double diameter() {
		return (double) (2 * radius);
	}
}
