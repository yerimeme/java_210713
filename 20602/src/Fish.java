
public class Fish extends Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fish gold = new Fish();
		gold.name = "�ݺؾ�";
		gold.toPrint();
		
		//��ĳ���� : ���� <-----����
		Animal ani = gold;
		ani.toPrint();
		
		
	//�ٿ�ĳ���� : ���� <----����
		//Fish silver = new Animal();
		//����
		Fish silver = (Fish)ani;
		silver.toPrint();

	}

}
