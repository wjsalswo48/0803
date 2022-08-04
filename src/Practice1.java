
public class Practice1 {
	public static void main(String[] args) {
		int sum = 0;
		Resum();
		for(int i =1; i<=100; i++) {
			sum += Resum(i);
		}
		System.out.println("sum = "+sum);
	}

	static void Resum() {
		int[] sum = new int[100];
		for (int i = 0; i < 100; i++) {
			for (int j = 1; j <= i + 1; j++) {
				sum[i] += j;
			}
			System.out.print(sum[i]);
			if (i < 99) {
				System.out.print("+");
			}
		}
		System.out.println();
	}

	static int Resum(int n) {
		int sum = 0;
		for (int j = 1; j <= n ; j++) {
			sum += j;
		}
		return sum;
	}
}
