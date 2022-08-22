import java.util.Locale;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int inicio, fim;
		int hora;
		hora = 0;
		inicio = in.nextInt(); // 2
		fim = in.nextInt(); // 16
		hora = fim - inicio;
		if(hora <= 0) {
			hora = hora + 24;
		}
		System.out.println("O JOGO DUROU "+hora+" HORA(S)");
		in.close();
	}
	
}