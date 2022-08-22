import java.util.Scanner;
public class Main {
      public static void main(String[] args) {
         Scanner in = new Scanner (System.in);
         int valor;
         int cedula[] = {100, 50, 20, 10, 5, 2, 1};
         int nota[] = new int[7];
         valor = in.nextInt();
         System.out.println(valor);
         for (int i=0; i<=6; i++) {
            nota [i] = valor / cedula[i];
            System.out.println(nota[i]+" nota(s) de R$ "+cedula[i]+",00");
         valor = valor - (nota[i] * cedula[i]);
         }
         in.close();
   }
}