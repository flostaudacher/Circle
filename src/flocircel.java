
public class flocircel extends circle {
	private String name;
	public flocircel(double radius, boolean filled, String cname) {
		super(radius,filled);
		this.setName(cname);
	}
	public flocircel(double radius, String cname) {
		this(radius,true,cname);
	}
	public flocircel(double radius) {
		this(radius,false,null);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
