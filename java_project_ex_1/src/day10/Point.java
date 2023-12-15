package day10;

public class Point {

	private int x;
	private int y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "x 는: " + x + " y는: " + y + "입니다";
	}

	public boolean equals(Object obj) {
		Point p = (Point) obj;
		if (this.x == p.x && this.y == p.y) {
			return true;
		} else {
			return false;
		}

	}

}// class
