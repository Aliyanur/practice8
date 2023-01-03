import java.util.Scanner;
class P8prob42{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("soz zhaz: ");
		String soz =in.next();

		for (int i=soz.length()-1;i>=0;i--) {
			char m =soz.charAt(i);
			System.out.print(m);
		}
	}
}
// 9.42. Составить программу, которая печатает заданное слово, начиная с последней
// буквы.