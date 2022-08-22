import java.util.Scanner;
public class Main {
	public static void main (String [] args) {
		Scanner in = new Scanner(System.in);
		for (int i=2; i<=100; i=i+2) {
			System.out.println(i);
		}
		in.close();
	}
}
