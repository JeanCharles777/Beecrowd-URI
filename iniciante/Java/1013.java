import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int A,B,C, MAIOR;
        A = in.nextInt();
        B = in.nextInt();
        C = in.nextInt();
        if (A>B) {
            if (A>C) {
                MAIOR = A;
            } else {
                MAIOR = C;
            }
        } else {
            if (B > C) {
                MAIOR = B;
            } else {
                MAIOR = C;
            }
        }
        System.out.println(MAIOR+" eh o maior");
        in.close();
    }

}