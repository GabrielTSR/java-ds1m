package Boletim;
import java.util.Scanner;

public class medias
{
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		double primeiraNota;
		double segundaNota;
		double terceiraNota;
		double quartaNota;
		
		System.out.println("Previs�o m�dia da escola:");
		System.out.println("____________________________________________");
		System.out.print("Escreva sua primeira nota: ");
		primeiraNota = leitor.nextDouble();
		System.out.println("");
		System.out.print("Escreva sua segunda nota: ");
		segundaNota = leitor.nextDouble();
		System.out.println("");
		System.out.print("Escreva sua terceira nota: ");
		terceiraNota = leitor.nextDouble();
		System.out.println("");
		System.out.print("Escreva sua quarta nota: ");
		quartaNota = leitor.nextDouble();
		System.out.println("");
		
		double media = ( primeiraNota + segundaNota + terceiraNota + quartaNota ) / 4;
		
		System.out.println("____________________________________________");
		System.out.println("\\\\\\\\\\\\\\Processando...////////////////");
		System.out.println("____________________________________________");
		
		
		if (media < 4 ) {
		    System.out.print("M�dia: ");
		    System.out.println(media);
		    System.out.print("Condi��o: ");
		    System.out.println("Reprovado");
		}
		
		
		else if ( media >= 4 && media < 6  ) {
		    System.out.print("M�dia: ");
		    System.out.println(media);
		    System.out.print("Condi��o: ");
		    System.out.println("Recupera��o");
		}
		
		
		else {
		    System.out.print("M�dia: ");
		    System.out.println(media);
		    System.out.print("Condi��o: ");
		    System.out.println("Aprovado");
		}
		
		System.out.println( "" );
		System.out.println( "FIM!" );
		
	}
}