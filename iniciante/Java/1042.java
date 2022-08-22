import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.0");
		int a, b, c;
		int sort[] = new int [3];
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		sort[0] = a;
		sort[1] = b;
		sort[2] = c;
        Arrays.sort(sort);
        for (int i = 0; i < sort.length; i++) {
        	System.out.println(sort[i]);
        }
        System.out.println("");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        in.close();
	}
	
}