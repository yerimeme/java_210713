//20602 ������
public class CircleMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle();
		c1.r = 5.0;
		double value1 = c1.calArea();
		double value2 = c1.calRound();
		System.out.println("���ڸ�" + c1.r + "���Ǹ���" + value1 + "���ǵѷ�" + value2);
		
		Circle c2 = new Circle(8.0);
		value1 = c2.calArea();
		value2 = c2.calRound();
		System.out.println("���ڸ�" + c2.r + "���Ǹ���" + value1 + "���ǵѷ�" + value2);

	}

}
