package Sample1;

public class Student {

	// 필드
	public String stuName; // 패키지에 관계 없이 모든 클래스에서 접근가능
	protected int sutNo;
	String stuDept;
	private int age;

	// 메소드
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}// class
