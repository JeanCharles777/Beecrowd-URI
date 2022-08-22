import java.util.Locale;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		double valor [] = new double[3];
		double a,b,c;
		double maior;
		boolean controle;
		
		valor[0] = in.nextDouble();
		valor[1] = in.nextDouble();
		valor[2] = in.nextDouble();
			
		Arrays.sort(valor);
		
		a = valor[2];
		b = valor[1];
		c = valor[0];
		
		if(a + b <= c || a + c <= b || b + c <= a) {
			System.out.println("NAO FORMA TRIANGULO");
		}else if((a*a)==(b*b)+(c*c)) {
			System.out.println("TRIANGULO RETANGULO");
		}else {
			if((a*a)==(b*b)+(c*c)) {
				System.out.println("TRIANGULO RETANGULO");
			}
			if((a*a)>(b*b)+(c*c)) {
					System.out.println("TRIANGULO OBTUSANGULO");
			}
			if((a*a)<(b*b)+(c*c)) {
				System.out.println("TRIANGULO ACUTANGULO");
			}
			if(a==b && b== c) {
				System.out.println("TRIANGULO EQUILATERO");
			}
			if((a==b || a == c || c == b)&&(a != c || c!=b || c != a)) {
				System.out.println("TRIANGULO ISOSCELES");
			}
		}

		in.close();
	}
	
}