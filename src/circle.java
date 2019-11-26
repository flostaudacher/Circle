
public class circle {
	
	static double radius;
	private static boolean filled;
	static double Umfang;
	static double Flaecheninhalt;
	public circle(double r, boolean filld) {
		setradius(r);
		Circumference();
		Area();
		filled = filld;
	}
	public circle(double r) {
		this(r,false);
	}
	public circle() {
		this(circlemain.setradius(),true);
	}
	private static void Area() {
		Flaecheninhalt=somemaths.PI*somemaths.square(radius);
	}
	public static double getArea() {
		return Flaecheninhalt;
	}
	private static void Circumference() {
		Umfang = 2*somemaths.PI*radius;
	}
	public static double getCircumference() {
		return Umfang;
	}
	static void setradius(double r) {
		radius = r;
	}
	static boolean getfilled() {
		return filled;
	}
	static double getradius() {
		return radius;
	}
	static double abhaengigkeitsmethode() {
		if (getfilled()) {
			Circumference();
			return getCircumference();
		}
		else {
			Area();
			return getArea();
		}
	}
}
