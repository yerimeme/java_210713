
public class DogMain {

	public static void main(String[] args) {
		// TODO Auto-geerated method stub
			Dog a = new Dog("Ǫ��",3, "���ڻ�")	;
			Dog b = new Dog("�ҵ�",5, "������")	;
			a.barking();
			a.hungry();
			b.sleeping();
			b.hungry();
			
			String str = b.toPrint();
			System.out.println(str);
			System.out.println(a.toPrint());
	}

}
