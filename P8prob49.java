import java.util.Scanner;
class P8prob49{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("soz zhaz: ");
		String soz=in.next();
		int len =soz.length();
		System.out.println(len);
		String star = " * ";

		for (int i = 1;i<=len-1; i++) {
			star+=" * ";	
		}
		System.out.println(star+soz+star);
	}
}
// 9.49. Дано слово. Добавить к нему в начале и конце столько звездочек, сколько
// букв в этом слове.