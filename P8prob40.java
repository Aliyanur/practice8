import java.util.Scanner;
class P8prob40{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		/*System.out.println("soz zhaz: ");
		String soz =in.next();
        //1
		System.out.println("enter k number: ");
		int k =in.nextInt();
		int len =soz.length();

		String soz1 = soz.substring(0,k);
		String soz2 = soz.substring(k,len);
		System.out.print(soz2+soz1);*/

		//2
		String slo =in.next();
		int len =slo.length();
		int m =in.nextInt();
		String soz1=;
		String soz2=;
		for (int i=0;i<m;i++ ) {
			String soz0=slo.substring(0,i+1);
			soz2 = soz0;
			String soz3 = slo.substring(m,len);
			soz2=soz3;
		}
		System.out.println(soz1+soz2);
	}
}
// 9.40. Дано слово. Перенести первые k его букв в конец.
// Задачу решить двумя способами:
// 1) без использования оператора цикла;
// 2) с использованием оператора цикла