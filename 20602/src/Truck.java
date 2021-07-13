//20602 ±¸¿¹¸²
public class Truck extends Car{

	int tan;
	
	public Truck(String color, String name, int velocity) {
		// TODO Auto-generated constructor stub
		super(color,name,velocity);
	}

	void print() {
		System.out.println("[Truck]"+ name + tan);
	}
}
