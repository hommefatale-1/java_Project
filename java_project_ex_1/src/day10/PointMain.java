package day10;

public class PointMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point p0 = new Point(1,2);
		Point p1 = new Point(1,2);
		Rect r1 = new Rect(3,4);
		Rect r2 = new Rect(1,2);
		
		System.out.println(p0 == p1);
		String name = "홀길동";
		
		System.out.println("홍길동" == name);
		System.out.println(name.equals("홀길동"));
		
		System.out.println(p0.equals(p1));
		
		//equals 메소드작성
		// 사각형의 넓이가 같으면 같다고 판별하도록
		//(width * height 같을 경우)
		
		System.out.println(r1.equals(r2));
		
		//문자열안에 숫자를 숫자로 변환
		String age = "10";
		Integer.parseInt(age);
		System.out.println(Integer.parseInt(age));
		/*
		 * System.out.println(p.equals(p));//패키지이름 클래스이름 주소값
		 * System.out.println(p.getClass());//클래스 패키지이름 클래스이름
		 * System.out.println(p.toString());//패키지 클래스 주소값
		 */
		
	}//main

}//class

