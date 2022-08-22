import java.util.Locale;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int a, b, div;
		a = in.nextInt();
		b = in.nextInt();
		if (a%b == 0 || b%a == 0) {
			System.out.println("Sao Multiplos");
		}else {
			System.out.println("Nao sao Multiplos");
		}
		
        in.close();
	}
	
}