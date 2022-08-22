import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        double hora, velocidade, litros;
        hora = in.nextInt();
        velocidade= in.nextInt();
        litros = (hora/12) * velocidade;
        System.out.printf("%.3f%n",litros);
    }
}