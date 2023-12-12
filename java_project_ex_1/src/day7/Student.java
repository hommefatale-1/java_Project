package day7;

public class Student {
	// 필드:클래스의 변수영역
	int stuNo;
	String stuName;
	String stuDept;
	int age;
	String gender;

	// 생성자 생성
	Student(int stuNo, String stuName) {
		this.stuNo = stuNo;
		this.stuName = stuName;
	}

	Student(int stuNo, String stuName, String stuDept) {
		this.stuNo = stuNo;
		this.stuName = stuName;
		this.stuDept = stuDept;
	}

	// 메소드 생성
	void setInfo(int age, String gender) {
		this.age = age;
		this.gender = gender;
	}

	int getAge() {
		return this.age;
	}
}
