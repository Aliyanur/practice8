import java.util.Scanner;
class P8prob70{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("soz zhaz: ");
		String soz = in.nextLine();
		char[] dauysty = soz.toCharArray();
		int count =0;

		for (char c :dauysty) {
			switch(c){
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'y':
				case 'u':
				count++;
				break;
			}
		}
		System.out.println("duysty sany: "+count);

	}
}
// }9.70. Дано предложение. Определить, сколько в нем гласных букв