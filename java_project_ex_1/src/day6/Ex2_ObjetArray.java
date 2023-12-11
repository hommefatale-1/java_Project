package day6;

public class Ex2_ObjetArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intArr[] = new int[5];
		String strArr[] = new String[5];
		Person PersonArr[] = new Person[5];

		Person p = new Person();

		for (int i = 0; i < strArr.length; i++) {
			PersonArr[i] = new Person();
			PersonArr[i].age = 30 + i;
		}
		for (int i = 0; i < strArr.length; i++) {
			System.out.print(PersonArr[i].age + " ");
		}

	}

}