import java.util.Scanner;
class P8prob21{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String aliya =in.next();

		char c1  =aliya.charAt(1);
		char c2 = aliya.charAt(2);
		char c3 = aliya.charAt(3);

		System.out.print(c1);
		System.out.print(c2);
		System.out.print(c3);
	}
}
// 9.21. Дано слово. Получить его часть, образованную второй, третьей и четвертой буквами.