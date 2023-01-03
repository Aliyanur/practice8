import java.util.Scanner;
class P8prob62{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("soz zhaz: ");
		String soz = in.next();
		int len =soz.length();
		int count =0;
		for (int i=0;i<soz.length();i++) {
			if (soz.charAt(i)=='a') {
				count++;	
			}
		}
		System.out.println("a aripi: "+count);
		System.out.println("arip "+soz+" : "+len);
		int pro =(count*100)/len;
		System.out.println("dolya: "+pro+"%");
		
	}
}
// 9.62. Дано предложение. Определить долю (в %) букв а в нем