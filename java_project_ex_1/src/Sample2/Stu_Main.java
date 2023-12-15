package Sample2;

import Sample1.Student;

public class Stu_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//맴버 접근지정자 확인용
		Student s = new Student();
		s.stuName = "홍길동";
		/*
		 * s.sutNo = 1234; s.stuDept = "컴퓨터"; s.age = 20;
		 */
		System.out.println(s.stuName);
	}
}
