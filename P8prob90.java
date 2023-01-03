import java.util.Scanner;
class P8prob90{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("soz zhaz: ");
		String soz =in.next();
		String jav = soz.replaceAll("e","i");
		System.out.println("result: "+jav );

	}
}
// 9.90. Дано предложение. Все буквы е в нем заменить буквой и. 