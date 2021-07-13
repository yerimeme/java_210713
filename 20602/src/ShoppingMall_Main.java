
public class ShoppingMall_Main {
	
	public static void main(String[] args) {
		ShoppingMall tv = new ShoppingMall("AABB123");
		tv.addTotal(10);
		
		ShoppingMall camera = new ShoppingMall("CCD456");
		camera.addTotal(20);
		camera.subtotal(5);
		
		HomeShopping bag = new HomeShopping("BAGB765");
		bag.setTime("12:30 PM");
		bag.addTotal(50);
		System.out.println(bag.code + "방송시간은" + bag.getTime()+"입니다");

	}

}
