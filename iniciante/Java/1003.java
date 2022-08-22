import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int A, B, SOMA;
        Scanner in = new Scanner(System.in);
        A = in.nextInt();
        B = in.nextInt();
        SOMA = A + B;
        System.out.println("SOMA = "+SOMA);
        in.close();
    }

}