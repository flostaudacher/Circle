import java.util.Scanner;

public class circlemain {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		somemaths math =new somemaths();
		System.out.println("1. Kreis:");
		circle a = new circle();
		System.out.println("Umfang : "+a.getCircumference());
		System.out.println("Flächeninhalt : "+a.getArea());
		if(a.getfilled()) {
			System.out.println("1. Kreis ist gefüllt");
		}
		else {
			System.out.println("1. Kreis ist nicht gefüllt");
		}
		System.out.println("\n2. Kreis:");
		double r2 = setradius();
		circle b = new circle(r2);
		System.out.println("Umfang : "+b.getCircumference());
		System.out.println("Flächeninhalt : "+b.getArea());
		if(b.getfilled()) {
			System.out.println("2. Kreis ist gefüllt");
		}
		else {
			System.out.println("2. Kreis ist nicht gefüllt");
		}
		
		System.out.println("\n3. Kreis:");
		double r3=setradius();
		circle c = new circle(r3,true);
		System.out.println("Umfang : "+c.getCircumference());
		System.out.println("Flächeninhalt : "+c.getArea());
		if(c.getfilled()) {
			System.out.println("3. Kreis ist gefüllt");
		}
		else {
			System.out.println("3. Kreis ist nicht gefüllt");
		}
		
		String Flo="Flo";
		flocircel flo=new flocircel(setradius(),true,Flo);
		System.out.println("Flo");
		if (flo.getfilled()) {
			System.out.println("Umfang : "+flo.getCircumference());
			System.out.println("3. Kreis ist gefüllt");
		}
		else {
			System.out.println("Flächeninhalt : "+flo.getArea());
			System.out.println("3. Kreis ist nicht gefüllt");
		}
	}
	static double setradius() {
		try {
			System.out.print("Radius eingeben = ");
			double radius=sc.nextInt();
			return radius;
		} catch (Exception e) {
			System.out.println("Something went wrong.");
		}
		finally {
		sc.close();
		}
		return -1;
	}
}
