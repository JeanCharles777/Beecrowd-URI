import java.util.Locale;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		double a, b, c;
		double perimetro,area;
		a = in.nextDouble();
		b = in.nextDouble();
		c = in.nextDouble();
		if (a + b > c && a + c > b && b + c > a) {
			perimetro = a+b+c;
			System.out.printf("Perimetro = %.1f%n",perimetro);
		}else {
			area = ((a+b)*c)/2;
			System.out.printf("Area = %.1f%n",area);
		}
        in.close();
	}
	
}