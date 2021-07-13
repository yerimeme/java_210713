
public class Student {
	
	Student(){
		count++;
		printCount();
	}
	
	Student(String name, int age){
		this();
		this.name = name;
		this.age = age;
		
	}
	
	final static String school = "서울로봇고"; 
	String name;
	int age;
	private String phone;
	public String setPhone;
	static int count = 0;
	
	void print() {
		System.out.println(name + ":" + age);
	}
	
	void print(int age) {
		System.out.println("나이:" + age);
	}
	
	void print(String name) {
		System.out.println("이름:" + name);
	}
	
	void printCount() {
		System.out.println("현재 등록된 학생은" + count + "명입니다.");
	}
	void setPhone(String phone) {
		this.phone = phone;
	}
	String getPhone() {
		return this.phone;
	}
	int getAge() {
		return this.age;
	}
	
}
