import java.util.Scanner;
class P8prob22{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("soz zhaz: ");
		String soz =in.next();

		int len =soz.length();
		System.out.println(len);
		int zhartysy = len/2;

		String newWord=soz.substring(0,zhartysy);
		System.out.println(newWord);
	}
}
// 9.22. Дано слово, состоящее из четного числа букв. Вывести на экран его первую половину, не используя оператор цикла.
