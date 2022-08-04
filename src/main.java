
public class main {
	public static void main(String[] args) {
		System.out.println("성적 관리 프로그램 시작");
		Student []array = new Student[2];
		Input input = new Input();
		input.input(array);
		Calc calc = new Calc();
		calc.calc(array);
		Sort sort = new Sort();
		sort.bubbleSorting(array);
		sort.selectionSortign(array);
		Output output = new Output();
		output.output(array);

		System.out.println("성적 관리 프로그램 끝");
	}

}
