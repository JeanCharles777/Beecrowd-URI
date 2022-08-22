import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int A, B, C, D, DIFERENCA;
        Scanner in = new Scanner(System.in);
        A = in.nextInt();
        B = in.nextInt();
        C = in.nextInt();
        D = in.nextInt();
        DIFERENCA = (A * B - C * D);
        System.out.println("DIFERENCA = "+ DIFERENCA);
        in.close();
    }

}