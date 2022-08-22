import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int A, B, C, D;
		A = in.nextInt();
		B = in.nextInt();
		C = in.nextInt();
		D = in.nextInt();
		if ( B > C ) {
			if (D > A && C+D > A+B){
				if (C>0 && D>0){
					if(A % 2 == 0){
						System.out.println("Valores aceitos");
					}else {
						System.out.println("Valores nao aceitos");
					}
				} else {
					System.out.println("Valores nao aceitos");
				}
			} else{
				System.out.println("Valores nao aceitos");
			}
		} else{
			System.out.println("Valores nao aceitos");
		}
		in.close();
	}
}