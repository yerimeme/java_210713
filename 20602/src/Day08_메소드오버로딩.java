
public class Day08_�޼ҵ�����ε� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   Add obj = new Add();
	       System.out.println(obj.sum(5, 8));
	       System.out.println(obj.sum("����","�κ���"));
	}

}
class Add{
	int sum(int a, int b) {
		return a+b;
	}
	
	String sum(String a, String b) {
		return a+b;
	}
}
