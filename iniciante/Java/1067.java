import java.util.Scanner;
public class Main {
	public static void main (String [] args) {
		Scanner in = new Scanner(System.in);
		int valor,i=1;
		valor = in.nextInt();
		while (i<=valor) {
			if(i%2!=0) {
				System.out.println(i);
			}
			i++;
		}
		in.close();
	}
}