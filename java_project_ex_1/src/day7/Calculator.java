package day7;

public class Calculator {

	static final double PI = 3.14;

	static int sum(int t, int k) {
		return t + k;
	}

	static int sum(int t, int k, int g) {
		return t + k + g;
	}

	static double sum(double t, double k) {
		return t + k;
	}

	static double circleArea(int radius) {
		return radius * radius * PI;
	}
}