import java.util.Locale;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int hi,mi,hf,mf;
		int hora,minuto;
		hi = in.nextInt();
		mi = in.nextInt();
		hf = in.nextInt();
		mf = in.nextInt();
		
		if(hf > hi && mf > mi) {
			hora = hf - hi;
			minuto = mf - mi;
			System.out.println("O JOGO DUROU "+hora+" HORA(S) E "+minuto+" MINUTO(S)");
		}else if(hf > hi && mi > mf) {
			hora = (hf - hi)-1;
			minuto = (mf-mi)+60;
			System.out.println("O JOGO DUROU "+hora+" HORA(S) E "+minuto+" MINUTO(S)");
		}else if(hf == hi && mi>mf) {
			hora = 23;
			minuto = (mf-mi)+60;
			System.out.println("O JOGO DUROU "+hora+" HORA(S) E "+minuto+" MINUTO(S)");
		}else if(hf == hi && mf>mi) {
			hora = 0;
			minuto = mf-mi;
			System.out.println("O JOGO DUROU "+hora+" HORA(S) E "+minuto+" MINUTO(S)");
		}else if(hf>hi && mf == mi) {
			hora = hf - hi;
			minuto = 0;
			System.out.println("O JOGO DUROU "+hora+" HORA(S) E "+minuto+" MINUTO(S)");
		}else if(hf < hi && mf == mi) {
			hora = (hf-hi)+24;
			minuto = 0;
			System.out.println("O JOGO DUROU "+hora+" HORA(S) E "+minuto+" MINUTO(S)");
		}else if(hi > hf && mf>mi) {
			hora = (hf-hi)+24;
			minuto = mf-mi;
			System.out.println("O JOGO DUROU "+hora+" HORA(S) E "+minuto+" MINUTO(S)");
		}else if(hi > hf && mi > mf) {
			hora = (hf-hi)+23;
			minuto = (mf-mi)+60;
			System.out.println("O JOGO DUROU "+hora+" HORA(S) E "+minuto+" MINUTO(S)");
		}else {
			System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
		}
		
		in.close();
	}
	
}