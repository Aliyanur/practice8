import java.util.Scanner;
class P8prob76{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("soz zhaz: ");
		String soz =in.next();
		int count =0;
		for (int i=0;i<soz.length();i++) {
			if (soz.charAt(i)=='e') {
              int m =soz.indexOf("e");
              System.out.println(m+1);
              count++;
              if (count==1) {
              	break;
              	}			
			}
		}
		System.out.println("songysy: ");
        for(int i = 0;i<soz.length();i++){
        if(soz.charAt(i)=='e'){
        int m1 = soz.lastIndexOf("e");
        System.out.println(m1+1);
        break;
        }
      }
	}
}
// 9.76. Дано предложение, в котором имеется несколько букв е. Найти:
// а) порядковый номер первой из них;
// б) порядковый номер последней из них.
