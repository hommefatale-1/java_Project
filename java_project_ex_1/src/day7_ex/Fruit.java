package day7_ex;

public class Fruit {

	private String kind;
	private String color;
	private int price;

	Fruit(String kind, String color, int price) {
		this.kind = kind;
		this.color = color;
		this.price = price;

	}

	public void getPrice() {
		System.out.println(kind + "는 " + price + "원 입니다.");
	}

	public void setFruit(String kind, String color, int price) {
		this.kind = kind;
		this.color = color;
		this.price = price;
	}

}// class
