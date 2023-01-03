import java.util.Scanner;
class P8prob37{
	public static void main(String[] args) {
		//1
		/*Scanner in = new Scanner(System.in);
		System.out.println("soz zhaz: ");
		String soz = in.nextLine();
		int len = soz.length();
		int zhartysy = len/2;

		String soz1 = soz.substring(0,zhartysy);
		String soz2 =soz.substring(zhartysy,len);
		System.out.println(soz2+soz1);*/
		//2
		Scanner in = new Scanner(System.in);
		System.out.println("soz zhaz: ");
		String soz = in.next();
		int len =soz.length()/2;
		String r ="";
		String r1 = "";
		for (int i=0;i<soz.length()/2;i++) {
			r = r+soz.charAt(i);
			r1=r1+soz.charAt(len+i);	
		}
		System.out.println(r1+r);
	}
}
// 9.37. Дано слово из четного числа букв. Поменять местами его половины. Задачу
// решить двумя способами:
// 1) без использования оператора цикла;
// 2) с использованием оператора цикла.