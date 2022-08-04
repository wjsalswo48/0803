
public class VariableArgumentDemo {
	public static void main(String[] args) {
		int a = 5;
		int b = 6;
		int c = 7;
		mymethod(a,"Hello, World",'A',89.5,false);
	}
	
	static void mymethod(Object ...array) {
		for(Object temp :  array) {
			System.out.println(temp);
		}
	}
}
