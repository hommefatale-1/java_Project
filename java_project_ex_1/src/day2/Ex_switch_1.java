package day2;

public class Ex_switch_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//switch문
		
		char grade = 'B';
		switch(grade) {
			case'A' :
				System.out.println("소 굿굿굿");
				break;
			case'B' :
				System.out.println("소 굿굿");
				break;
			case'C' :
				System.out.println("소 굿");
				break;
			case'D' :
				System.out.println("굿");
				break;
		default:
			System.out.println("화이팅");
		}
		
	}

}
