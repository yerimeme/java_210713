//���� Ŭ���� -�θ�
public class Animal {
	
	String species; //��
	String name; 	//�̸�
	int age;		//����
	
	//�⺻�� ������
	Animal(){}
	
	Animal(String name){
		System.out.println("Animal �⺻������");
	}
	
	Animal(String name, int age){
		System.out.println("Animal �⺻������");
	}
	
	void toPrint() {
		System.out.println("�� ������ " + name);
	}

}
