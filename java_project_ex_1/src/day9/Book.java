package day9;

public class Book {

	String title;
	String author;
	int num;

	Book(String title, String author, int num) {
		this.title = title;
		this.author = author;
		this.num = num;
	}

	Book(String title, int num) {
		this(title, "익명", num);
		/*
		 * this.title = title; this.author = "익명"; this.num = num;
		 */
	}

	Book() {
		this(null, null, 0);

		/*
		 * this.title = null; this.author = null; this.num = 0;
		 */
	}

}// class
