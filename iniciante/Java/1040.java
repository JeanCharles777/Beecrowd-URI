import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.0");
		double N1, N2, N3, N4;
		double MEDIA;
		N1 = 2 * in.nextDouble();
		N2 = 3 * in.nextDouble();
		N3 = 4 * in.nextDouble();
		N4 = 1 *in.nextDouble();
        MEDIA = (N1+N2+N3+N4) / 10;
		System.out.println("Media: " + df.format(MEDIA));
        if (MEDIA >= 7) {
        	System.out.println("Aluno aprovado.");
        } else if (MEDIA < 7 && MEDIA >= 5) {
        	System.out.println("Aluno em exame.");
        	double NExame = in.nextDouble();
			System.out.println("Nota do exame: " + df.format(NExame));
        	MEDIA = (MEDIA + NExame) / 2;
        	if (MEDIA >= 5) {
            	System.out.println("Aluno aprovado.");
        	} else {
            	System.out.println("Aluno reprovado.");
        	}
			System.out.println("Media final: " + df.format(MEDIA));
        } else {
        	System.out.println("Aluno reprovado.");
        }
	}
	
}