import java.util.Scanner;
public class Main {
	public static void main (String [] args) {
		Scanner in = new Scanner(System.in);
		double valor,sobra=0,imposto=0;
		valor = in.nextDouble();
		if(valor < 2000) {
			System.out.println("Isento");
		}else {
			if(valor > 4500) {
				sobra = valor - 4500;
				imposto = (sobra/100)*28;
				valor = valor - sobra;
			}
			if(valor > 3000) {
				sobra = valor - 3000;
				imposto = imposto + ((sobra/100)*18);
				valor = valor - sobra;
			}
			if(valor > 2000) {
				sobra = valor - 2000;
				imposto = imposto + ((sobra/100)*8);
				valor = valor - sobra;
			}
			System.out.printf("R$ %.2f\n",imposto);
		}
		in.close();
	}

}