import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int CODIGOP1, NUMEROP1;
        double VALORP1;
        int CODIGOP2, NUMEROP2;
        double VALORP2;
        double TOTAL;
        CODIGOP1 = in.nextInt();
        NUMEROP1 = in.nextInt();
        VALORP1 = in.nextDouble();
        CODIGOP2 = in.nextInt();
        NUMEROP2 = in.nextInt();
        VALORP2 = in.nextDouble();
        TOTAL = (NUMEROP1 * VALORP1) + (NUMEROP2 * VALORP2);
        System.out.printf("VALOR A PAGAR: R$ %.2f%n",TOTAL);
        in.close();
    }

}