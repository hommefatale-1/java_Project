package day7;

public class Human {

	static int money;
	private String name;
	private int age;

	static void staticTest() {
		System.out.println("현재 잔액 : " + money);
	}

	Human(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
