import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int codigo, quantidade;
        double preco=0, total;
        codigo = in.nextInt();
        switch (codigo) {
        case 1: 
        	preco = 4.0;
        	break;
        case 2:
        	preco = 4.50;
        	break;
        case 3:
        	preco = 5.00;
        	break;
        case 4:
        	preco = 2.00;
        	break;	
        case 5:
        	preco = 1.50;
        	break;
        }
        quantidade = in.nextInt();
        total = preco * quantidade;
        System.out.printf("Total: R$ %.2f%n",total);
        in.close();
  }
}