//20602 ������
public class TaxiMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Taxi t1 = new Taxi();
		t1.name = "īī���ý�";
		t1.color = "RED";
		t1.velocity = 50;
		
		t1.speedUP();
		t1.payUp();
		t1.payUp();
		
		Truck t2 = new Truck("�Ķ�","����",100);
		t2.print();
		
		t1.print();

	}

}
