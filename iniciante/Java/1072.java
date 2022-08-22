import java.util.Scanner;
public class Main {
	public static void main (String []args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int cIn=0, cOut=0, valor;
		for(int i=0; i<x;i++) {
			valor = in.nextInt();
			if(valor>=10 && valor<=20) {
				cIn = cIn + 1;
			}else {
				cOut = cOut + 1;
			}
		}
		System.out.println(cIn+" in");
		System.out.println(cOut+" out");
		in.close();
	}
}