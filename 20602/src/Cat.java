
public class Cat {

	Cat(){
		count++;
	}
	Cat(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	String name;
	int age;
	static int count;
	
	void print() {
		System.out.println(name + ":" + age);
	}
	void print(String newName) {
		this.name = newName;
		print();
	}
	static void printCount() {
		System.out.println("현재 총 마리수:" + count);
	}
}
