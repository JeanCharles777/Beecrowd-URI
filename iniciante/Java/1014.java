import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int X;
        double Y, CONSUMO;
        X = in.nextInt();
        Y = in.nextDouble();
        CONSUMO = X / Y;
        System.out.printf("%.3f km/l%n", CONSUMO);
        in.close();
    }

}