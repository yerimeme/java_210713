
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
	
	final static String school = "����κ���"; 
	String name;
	int age;
	private String phone;
	public String setPhone;
	static int count = 0;
	
	void print() {
		System.out.println(name + ":" + age);
	}
	
	void print(int age) {
		System.out.println("����:" + age);
	}
	
	void print(String name) {
		System.out.println("�̸�:" + name);
	}
	
	void printCount() {
		System.out.println("���� ��ϵ� �л���" + count + "���Դϴ�.");
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
