import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String NOME;
        double SALARIO, VENDA, TOTAL;
        Scanner in = new Scanner(System.in);
        NOME = in.next();
        SALARIO = in.nextDouble();
        VENDA = in.nextDouble();
        TOTAL = SALARIO + (VENDA * 0.15);
        System.out.printf("TOTAL = R$ %.2f%n", TOTAL);
        in.close();
    }

}