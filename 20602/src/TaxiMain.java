//20602 구예림
public class TaxiMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Taxi t1 = new Taxi();
		t1.name = "카카오택시";
		t1.color = "RED";
		t1.velocity = 50;
		
		t1.speedUP();
		t1.payUp();
		t1.payUp();
		
		Truck t2 = new Truck("파랑","포터",100);
		t2.print();
		
		t1.print();

	}

}
