
public class Day07_스태틱변수연습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student a = new Student();
		a.name = "홍길동"; a.age = 10;
		a.print();
		
		Student b = new Student();
		b.name = "박찬호"; b.age = 12;
		b.print();
		
		Student c = new Student("구예림", 18);
		c.print();
		
		//a.school = "서울고";
		a.print();
		b.print();
		b.print(10);
		b.print("박찬호");
		
		c.setPhone = ("010-1111-2222");
		System.out.println();
		
		System.out.println(a.getAge());
		System.out.println(b.getAge());
		System.out.println(c.getAge());
	}

}
