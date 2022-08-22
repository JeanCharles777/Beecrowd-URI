import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int NUMERO, HORAS;
        double SALARIO, TRABALHADO;
        Scanner in = new Scanner(System.in);
        NUMERO = in.nextInt();
        HORAS = in.nextInt();
        SALARIO = in.nextDouble();
        TRABALHADO = HORAS * SALARIO;
        System.out.println("NUMBER = "+NUMERO);
        System.out.printf("SALARY = U$ %.2f%n",TRABALHADO);
        in.close();
    }

}