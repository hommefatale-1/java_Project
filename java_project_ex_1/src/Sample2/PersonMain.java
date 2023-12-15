package Sample2;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person person = new Person("홍길동", 20);
		person.getPhone(123-123);

		MultipleCalc.sum(1, 3);
		MultipleCalc.sum(5, 6, 7);
		System.out.println(MultipleCalc.sum(1, 3));
		System.out.println(MultipleCalc.sum(5, 6, 7));

	}//main
}//class
