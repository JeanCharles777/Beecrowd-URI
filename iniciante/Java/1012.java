import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        double A, B, C;
        double TRIANGULO, CIRCULO, TRAPEZIO, QUADRADO, RETANGULO;
        A = in.nextDouble();
        B = in.nextDouble();
        C = in.nextDouble();
        TRIANGULO = (A * C)/2;
        CIRCULO = 3.14159 * C * C;
        TRAPEZIO = (A+B) * C / 2;
        QUADRADO = B * B;
        RETANGULO = A * B;
        System.out.printf("TRIANGULO: %.3f%n", TRIANGULO);
        System.out.printf("CIRCULO: %.3f%n", CIRCULO);
        System.out.printf("TRAPEZIO: %.3f%n", TRAPEZIO);
        System.out.printf("QUADRADO: %.3f%n", QUADRADO);
        System.out.printf("RETANGULO: %.3f%n", RETANGULO);
        in.close();
    }

}