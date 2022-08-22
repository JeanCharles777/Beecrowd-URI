import java.util.Scanner;
public class Main {
	public static void main (String [] args) {
		Scanner in = new Scanner(System.in);
		double valor,somador=0,media;
		int contador=0;

		for(int i = 1; i<=6;i++) {
			valor = in.nextDouble();
			if(valor > 0) {
				contador = contador +1;
				somador = somador + valor;
			}
		}
		media = somador / contador;
		System.out.println(contador+" valores positivos");
		System.out.printf("%.1f\n",media);
		in.close();
	}
}
