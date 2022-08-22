import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int A, B, PROD;
        Scanner in = new Scanner(System.in);
        A = in.nextInt();
        B = in.nextInt();
        PROD = A * B;
        System.out.println("PROD = "+PROD);
        in.close();
    }

}