
public class PizzaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pizza p1 = new Pizza();
		p1.setSize(12);
		p1.setType("���۽�����");
		Pizza p2 = new Pizza("��������");
		p2.setSize(24);
		Pizza p3 = new Pizza(12,"�Ұ��");
		
		p1.toPrint();
		p2.toPrint();
		p3.toPrint();

	}

}
