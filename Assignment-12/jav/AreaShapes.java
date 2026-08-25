package Area;

import MySqPackage.Square;
import MyPackage.Rectangle;
import MyCirPackage.Circle;


public class AreaShapes{
	public static void main(String[] args) {
		Rectangle rt = new Rectangle();
		System.out.println(rt.displayArea(3,5));

		Square ss = new Square();
		System.out.println(ss.displayArea(6));	

		Circle ci = new Circle();
		System.out.println(ci.displayArea(7));
	}
}