
public class Phone {
	Phone(){
		total++;
	}
	Phone(String model, int price,String made){
		this();
		this.model = model;
		this.price = price;
		this.made = made;
	}
	String model;
	int price;
	static int total;
	String made;
	
	String toPrint() {
		String str = this.made + " " + this.price + " " + this.model + "만원";
		return str;
	}
	void printTotal() {
		System.out.println("현재 총 " + total + "걔 재고있음");
	}
	
	void Pade() {
		System.out.println("현재 총 " + total + "걔 재고있음");
	}

}
