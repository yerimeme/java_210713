//20602 ������
public class Car {//�θ�Ŭ����
	String color;
	String name;
	int velocity;
	
	Car(){}
	Car(String color, String name, int velocity){
		this.color = color;
		this.name = name;
		this.velocity = velocity;
	}
	
	void speedUP() {
		System.out.println(name + "�ӵ� �ø���");
	}

	void speedDown() {
		System.out.println(name +"�ӵ� ������");
	}
	void print() {
		System.out.println("[CAR]");
	}

}
