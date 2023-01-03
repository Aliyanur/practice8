import java.util.Scanner;
class P8prob109{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("soz zhaz: ");
		String soz=in.next();
		//a
		/*int ush =3;
		int len=soz.length();
		String newWord =soz.substring(0,ush-1);
		String newWord2 =soz.substring(ush,len);
		System.out.print(newWord+newWord2);*/
		//b
		System.out.println("enter k :");
		int k =in.nextInt();
		int len = soz.length();
		String newWord =soz.substring(0,k-1);
		String newWord2 = soz.substring(k,len);

		System.out.println(newWord+newWord2);
	}
}
// 9.109. Дано слово.
// а) Удалить из него третью букву.
// б) Удалить из него k-ю букву.
