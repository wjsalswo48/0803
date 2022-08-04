import java.util.Scanner;

public class MethodOverloadingDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(add(34.5,67.8));
		System.out.println(add(3,4,5));
		System.out.println(add(3,5));
	}
	static int add(int a, int b) {
		return a+b;
	}
	static int add(int a, int b, int c) {
		return a+b+c;
	}
	static double add(double a, double b) {
		return a+b;
	}
}
