package day10;

public class Rect {

	private int width;
	private int heifht;

	Rect(int w, int h) {
		this.width = width;
		this.heifht = heifht;
	}

	public boolean equals(Rect obj) {
		
		if ((this.width * this.heifht) == (obj.width * obj.heifht)) {
			return true;
		} else {
			return false;
		}

	}
}
