
public class RecursiveMethodDemo {
	public static void main(String[] args) {
		mymethod(10);
		
	}
	static void mymethod(int max) {
		System.out.println("1:"+max);
		if(max<=0) return;
		else mymethod(--max);
		System.out.println("2:"+max);
	}
}
