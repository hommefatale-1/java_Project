package day7_ex;

public class FruitMain {

	static void boxing(Object obj) {
		if (obj instanceof Banana) {
			System.out.println("'바나나를 상자에 담았다.'");
		} else if (obj instanceof Orange) {
			System.out.println("'오렌지를 상자에 담았다.'");
		} else if (obj instanceof Apple) {
			System.out.println("'사과를 상자에 담았다.'");
		} else {
			System.out.println("뭔지 모르게싿");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit banana = new Fruit("바나나", "노란색", 8000);
		Fruit orange = new Fruit("오렌지", "주황색", 3000);
		Fruit apple = new Fruit("사과", "빨간색", 4000);

		banana.getClass();
		apple.getPrice();
	}

}
