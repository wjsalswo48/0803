import java.util.Scanner;

public class Input {
	void input(Student[] array) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			array[i]=new Student(); //한명의 학생 주소를 생성해서 학생주소배열에 넣는다.
			array[i].ranking=1;
			System.out.print("Hakbun: ");
			array[i].hakbun = sc.nextLine(); //그 학생 주소의 학번
			System.out.print("Name");
			array[i].name = sc.nextLine();
			System.out.print("Koraen");
			array[i].kor = sc.nextInt();
			System.out.print("English");
			array[i].eng = sc.nextInt();
			System.out.print("Math");
			array[i].mat = sc.nextInt();
			sc.nextLine();

		}
	}
}
