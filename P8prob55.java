import java.util.Scanner;
class P8prob55{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("soilem zhaz: ");
		String soz = in.next();
		char m1 = 'a';
		char m2='o';
		for (int i =0;i<soz.length();i++) {
			char m =soz.charAt(i);
			if (m==m1||m==m2) {
				System.out.println(i+" : "+m);
			}
		}
	}
}
// 9.55. Дано предложение. Составить программу, которая выводит все вхождения
// в предложение двух заданных символов. 32q