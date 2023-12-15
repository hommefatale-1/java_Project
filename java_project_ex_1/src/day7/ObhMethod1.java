package day7;

public class ObhMethod1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1,3,5,8,9};
		//클라스 사용하고 싶으면 객체 생성후 호출하여 사용
		Ex1_ObjMethod obj= new Ex1_ObjMethod();
		
		int sum = obj.sumArray(arr);
		System.out.println("배열의 총합 : " + sum);
		
		
		//static 접근
		Ex1_ObjMethod.sumArray2(arr);
		obj.sumArray(arr);
		
		
		Ex1_ObjMethod hong1 = new Ex1_ObjMethod("홍길동");
		Ex1_ObjMethod hong2 = new Ex1_ObjMethod("홍길동");
		
		//Ex1_ObjMethod 클래스에서 객체를 비교하는 매소드 생성
		//두 객체가 가지고 있는 name의 값이 같다면 '같은 사람 입니다.라는 메시지 출력
		
		hong1.nameEquals(hong2);
	
	}//class

}//main
