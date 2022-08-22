import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        Locale.setDefault(Locale.US);
        double a, b, c;
        double delta;
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();
        delta = Math.pow(b, 2) - (4 * a * c);
        if ((delta < 0) || (a == 0)) {
            System.out.println("Impossivel calcular");
        }
        if ((delta > 0) && (a != 0)) {
            double x1, x2;
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.printf("R1 = %.5f\n", x1);
            System.out.printf("R2 = %.5f\n", x2);
        in.close();
    }
  }
}