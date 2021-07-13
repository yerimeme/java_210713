//20602 구예림
public class CircleMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle();
		c1.r = 5.0;
		double value1 = c1.calArea();
		double value2 = c1.calRound();
		System.out.println("반자름" + c1.r + "원의면적" + value1 + "원의둘레" + value2);
		
		Circle c2 = new Circle(8.0);
		value1 = c2.calArea();
		value2 = c2.calRound();
		System.out.println("반자름" + c2.r + "원의면적" + value1 + "원의둘레" + value2);

	}

}
