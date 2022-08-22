import java.util.Scanner;
public class Main {
      public static void main (String [] args) {
           Scanner in = new Scanner (System.in);
           int n, ano, mes, dia;
           n = in.nextInt();
           ano = n / 365;
           mes = (n % 365) / 30;
           dia = ((n % 365) % 30) %30;
           System.out.println(ano+" ano(s)");
           System.out.println(mes+" mes(es)");
           System.out.println(dia+" dia(s)");
         in.close();
   }
}