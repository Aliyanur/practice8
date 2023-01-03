import java.util.Scanner;
class P8prob17{
	public static void main(String[] args) {
		/*String aliya ="ALIYA";
		char c0 = aliya.charAt(0);
		char c1 = aliya.charAt(4);
		if (c0==c1) {
			System.out.println("true");	
		}else{
			System.out.println("false");
		}*/
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the weekend: ");
		String word =in.next();

		int i =word.length();
		char c0 = word.charAt(0);
		char c1 = word.charAt(i-1);
		if (c0==c1) {
			System.out.println("true");	
		}else{
			System.out.println("false");
		}
	}
}
// 9.17. Дано слово. Верно ли, что оно начинается и оканчивается на одну и ту же букву?
