import java.util.Scanner;
class P8prob112{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("soilemder zhaz: ");
		String soilemder = in.nextLine();
		int len = soilemder.length();

		System.out.println("n1 zhane n2 sandaryn engizh: ");
		int n1 =in.nextInt();
		int n2 =in.nextInt();
		String m = soilemder.substring(0,n1);
		String m1 = soilemder.substring(n2+1,len);

		System.out.println("zhayaby: "+m+m1);
		
	}
}
// 9.112. Дано предложение. Удалить из него все символы с n1-го по n2-й (n1 <=n2)