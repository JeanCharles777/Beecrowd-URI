import java.util.Scanner;
public class Main {
	public static void main (String [] args) {
		Scanner in = new Scanner(System.in);
		double valor;
		int cPos=0,cNeg=0,cPar=0,cImp=0;

		for(int i=1;i<=5;i++){
			valor = in.nextDouble();
			if(valor > 0 ) {
				cPos = cPos+1;
			}else if(valor<0) {
				cNeg = cNeg+1;
			}
			if(valor%2==0) {
				cPar = cPar+1;
			}else{
				cImp = cImp+1;
			}
		}
		System.out.println(cPar+" valor(es) par(es)");
		System.out.println(cImp+" valor(es) impar(es)");
		System.out.println(cPos+" valor(es) positivo(s)");
		System.out.println(cNeg+" valor(es) negativo(s)");
		in.close();
	}
}