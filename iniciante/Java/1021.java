import java.util.Locale;
import java.util.Scanner;
public class Main {
      public static void main(String[] args) {
         Scanner in = new Scanner (System.in);
         Locale.setDefault(Locale.US);
         double valor;
         int cedula[] = {100, 50, 20, 10, 5, 2};
         int real[] = new int[6];
         int moeda[] = {100, 50, 25, 10, 5, 1};
         double moedaPrint [] = {1, 0.50, 0.25, 0.10, 0.05, 0.01};
         int centavo[] = new int[6];
         valor = in.nextDouble();
         System.out.println("NOTAS:");
         for (int i=0; i<=5; i++) {
            real [i] = (int)valor / cedula[i];
            System.out.println(real[i]+" nota(s) de R$ "+cedula[i]+".00");
         valor = valor - (real[i] * cedula[i]);
         }
         System.out.println("MOEDAS:");
         valor = valor * 100.00;
         for (int i=0; i<=5; i++){
         	centavo [i] = (int)valor/moeda[i];
         	System.out.printf(centavo[i]+" moeda(s) de R$ %.2f%n",moedaPrint[i]);
         	valor = valor -(centavo[i]*moeda[i]);
         }
         in.close();
   }
}