import java.util.Scanner;
public class Main {
      public static void main (String [] args) {
           Scanner in = new Scanner (System.in);
           int n, horas, minutos, segundos;
           n = in.nextInt();
           horas = n / 3600;
           minutos = (n % 3600)/60;
           segundos = ((n % 3600)%60)%60;
           System.out.println(horas+":"+minutos+":"+segundos);
         in.close();
   }
}