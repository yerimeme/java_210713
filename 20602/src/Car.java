//20602 구예림
public class Car {//부모클래스
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
		System.out.println(name + "속도 올리기");
	}

	void speedDown() {
		System.out.println(name +"속도 내리기");
	}
	void print() {
		System.out.println("[CAR]");
	}

}
