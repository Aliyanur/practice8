import java.util.Scanner;
class P8prob92{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("predlozhenie zhaz: ");
		String soz =in.nextLine();
		char soz1;
		for (int i =0;i<soz.length();i++) {
			soz1 = soz.charAt(i);
			if (i%2!=0) {
				soz1 ='i';
			}
		  System.out.print(soz1);	
		}
	}
}
// 9.92. Дано предложение. Все его символы, стоящие на четных местах, заменить
// буквой ы.