import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double A, B, MEDIA;
        Scanner in = new Scanner(System.in);
        A = in.nextDouble();
        B = in.nextDouble();
        MEDIA = (A*3.5 + B*7.5)/11;
        System.out.printf("MEDIA = %.5f%n", MEDIA);
        in.close();
    }

}