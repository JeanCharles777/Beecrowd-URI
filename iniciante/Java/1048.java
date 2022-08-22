import java.util.Locale;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		double salario, reajuste=0,salarioFinal=0;
		int percentual=0;
		salario = in.nextDouble();
		if(salario <= 400) {
			reajuste = (salario / 100)*15;
			percentual = 15;
			salarioFinal = salario + reajuste;
		}else if(salario <= 800) {
			reajuste = (salario / 100)*12;
			percentual = 12;
			salarioFinal = salario + reajuste;
		}else if(salario <= 1200) {
			reajuste = (salario / 100)*10;
			percentual = 10;
			salarioFinal = salario + reajuste;
		}else if(salario <= 2000) {
			reajuste = (salario / 100)*7;
			percentual = 7;
			salarioFinal = salario + reajuste;
		}else if(salario > 2000) {
			reajuste = (salario / 100)*4;
			percentual = 4;
			salarioFinal = salario + reajuste;
		}
		System.out.printf("Novo salario: %.2f%n",salarioFinal);
		System.out.printf("Reajuste ganho: %.2f%n",reajuste);
		System.out.println("Em percentual: "+percentual+" %");
		in.close();
	}
	
}