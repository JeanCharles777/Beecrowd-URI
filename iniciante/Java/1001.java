import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int A, B, X;
        A = in.nextInt();
        B = in.nextInt();
        X = A + B;
        System.out.println("X = "+X);
        in.close();
    }
}