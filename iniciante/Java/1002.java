import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double raio, area, pi;
        Scanner in = new Scanner(System.in);
        pi = 3.14159;
        raio = in.nextDouble();
        area = (raio * raio)*pi;
        System.out.printf("A=%.4f%n", area);
        in.close();
    }

}