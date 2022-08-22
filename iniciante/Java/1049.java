import java.util.Locale;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		String tipo1 = "null",tipo2="null",tipo3="null";
		tipo1 = in.next();
		tipo2 = in.next();
		tipo3 = in.next();
		if(tipo1.equalsIgnoreCase("vertebrado")) {
			if(tipo2.equalsIgnoreCase("ave")) {
				if(tipo3.equalsIgnoreCase("carnivoro")) {
					System.out.println("aguia");
				}else if(tipo3.equalsIgnoreCase("onivoro")) {
					System.out.println("pomba");
				}
			}else if(tipo2.equalsIgnoreCase("mamifero")) {
				if(tipo3.equalsIgnoreCase("onivoro")) {
					System.out.println("homem");
				}else if(tipo3.equalsIgnoreCase("herbivoro")) {
					System.out.println("vaca");
				}
			}
		}else if(tipo1.equalsIgnoreCase("invertebrado")) {
			if(tipo2.equalsIgnoreCase("inseto")) {
				if(tipo3.equalsIgnoreCase("hematofago")) {
					System.out.println("pulga");
				}else if(tipo3.equalsIgnoreCase("herbivoro")) {
					System.out.println("lagarta");
				}
			}else if(tipo2.equalsIgnoreCase("anelideo")){
				if(tipo3.equalsIgnoreCase("hematofago")) {
					System.out.println("sanguessuga");
				}else if(tipo3.equalsIgnoreCase("onivoro")) {
					System.out.println("minhoca");
				}
			}
		}
		in.close();
	}
	
}