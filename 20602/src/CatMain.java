
public class CatMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat1 = new Cat();
		cat1.name = "�ǻ�";
		cat1.age = 2;
		
		cat1.print();
		cat1.printCount();
		
		Cat cat2 = new Cat("������",3);
		cat2.print();
		cat2.printCount();
		
		cat2.print("�ʷ���");
	}
}
