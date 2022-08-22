import java.util.Scanner;
public class Main {
	public static void main (String [] args) {
		Scanner in = new Scanner(System.in);
		int inicioEmSegundo,finalEmSegundo;
		//String
		String diaInicialS []  = in.nextLine().split(" ");
		String horaInicialS [] = in.nextLine().replaceAll(" ","").split(":");
		String diaFinalS [] = in.nextLine().split(" ");
		String horaFinalS  [] = in.nextLine().replaceAll(" ","").split(":");
		
		//Conversão
		int diaInicial = Integer.parseInt(diaInicialS[1]);
		int horaInicial = Integer.parseInt(horaInicialS[0]);
		int minutoInicial = Integer.parseInt(horaInicialS[1]);
		int segundoInicial = Integer.parseInt(horaInicialS[2]);
		
		int diaFinal = Integer.parseInt(diaFinalS[1]);
		int horaFinal = Integer.parseInt(horaFinalS[0]);
		int minutoFinal= Integer.parseInt(horaFinalS[1]);
		int segundoFinal = Integer.parseInt(horaFinalS[2]);
		
		inicioEmSegundo = (segundoInicial*1) + (minutoInicial*60)+(horaInicial*60*60)+(diaInicial*60*60*24);
		finalEmSegundo = (segundoFinal*1) + (minutoFinal*60)+(horaFinal*60*60)+(diaFinal*60*60*24);
		
		int tempo = finalEmSegundo - inicioEmSegundo;
		
		
        System.out.println(tempo/(60*60*24)+" dia(s)");
        tempo = tempo %(60*60*24);
        System.out.println(tempo/(60*60)+" hora(s)");
        tempo = tempo %(60*60);
        System.out.println(tempo/(60)+" minuto(s)");
        tempo = tempo %60;
        System.out.println(tempo+" segundo(s)");
		in.close();
	}
}