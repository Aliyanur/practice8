import java.util.Scanner;
class P8prob25{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String soz = in.next();
		//informatika
		String soz1 = soz.substring(2,7);
		String soz2 = soz.substring(7,10);
		System.out.println(soz1+" zhane "+soz2);
		
	}
}
// Из слова информатика путем "вырезок" и "склеек" его букв получить слова форма и тик.
