
public class Fish extends Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fish gold = new Fish();
		gold.name = "금붕어";
		gold.toPrint();
		
		//업캐스팅 : 상위 <-----하위
		Animal ani = gold;
		ani.toPrint();
		
		
	//다운캐스팅 : 하위 <----상위
		//Fish silver = new Animal();
		//에러
		Fish silver = (Fish)ani;
		silver.toPrint();

	}

}
