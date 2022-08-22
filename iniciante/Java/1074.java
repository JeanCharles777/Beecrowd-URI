import java.util.Scanner;
public class Main {
	public static void main (String []args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int val;
		for (int i=1;i<=n;i++) {
			val = in.nextInt();
			if( val == 0) {
				System.out.println("NULL");
			}else if(val%2==0) {
				if(val>2) {
					System.out.println("EVEN POSITIVE");
				}else {
					System.out.println("EVEN NEGATIVE");
				}
			}else{
				if(val>2) {
					System.out.println("ODD POSITIVE");
				}else {
					System.out.println("ODD NEGATIVE");
				}
			}
		}
		in.close();
	}
}
