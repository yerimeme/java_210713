//20602 ������
public class Circle {
	Circle(){};
	Circle(double r){
		this.r =r;
	}
	double r;
	
	double calArea() {
		return r*r*3.14;
	}
	
	double calRound() {
		return 2*r*3.14;
	}
	
	

}
