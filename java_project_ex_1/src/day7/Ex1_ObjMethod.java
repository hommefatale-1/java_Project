package day7;

public class Ex1_ObjMethod {
	private String name;

	Ex1_ObjMethod(String name) {
		this.name = name;
	}

	Ex1_ObjMethod() {
	}

	int sumArray(int arr[]) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	static int sumArray2(int arr[]) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// Ex1_ObjMethod 클래스에서 객체를 비교하는 매소드 생성
	// 두 객체가 가지고 있는 name의 값이 같다면 '같은 사람 입니다.라는 메시지 출력
	void nameEquals(Ex1_ObjMethod obj) {
		if(this.name.equals(obj.getName())){
			System.out.println("같습니다");
		}
	}
}// class
