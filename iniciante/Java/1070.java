import java.util.Scanner;
public class Main {
	public static void main (String [] args) {
		Scanner in = new Scanner(System.in);
		int valor, controlador,i=0,j=0;
		valor = in.nextInt();
		while(i<6) {
				if(valor%2!=0) {
					System.out.println(valor);
					i++;
				}
				valor++;
		}
		in.close();
	}
}
