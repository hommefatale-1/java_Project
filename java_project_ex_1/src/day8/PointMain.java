package day8;

public class PointMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 객체 생성 후 x = 1, y =2 값 넣어보기

		Point po = new Point(1, 2);
//		po.setXY(1, 2);
		po.showPoint();

		ColorPoint cPoint = new ColorPoint(3, 4, "green");
		
		 /* cPoint.setXY(2, 3);
		 	cPoint.showPoint();*/
		cPoint.showcolorPoint();
	}// main

}// class

