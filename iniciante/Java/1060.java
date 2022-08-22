import java.util.Scanner;
public class Main {
	public static void main (String [] args) {
		Scanner in = new Scanner(System.in);
		int res=0;
		double  valor;
		for (int i=1; i<=6; i++) {
			valor = in.nextDouble();
			if(valor > 0) {
				res = res+ 1;
			}
		}
		System.out.println(res+" valores positivos");
		in.close();
	}
}