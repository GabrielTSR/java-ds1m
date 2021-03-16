import java.util.Random;
import java.util.Scanner;

public class Jokenpo
{
	public static void main(String[] args) {
		
		Random escolha = new Random();
		Scanner leitor = new Scanner(System.in);
		
		int escolhaJogador;
		int escolhaComputador;
		
		escolhaComputador = escolha.nextInt(3); //Escolha de 0 a 2
		
		System.out.println("JOKENP�");
		System.out.println("Escreva sua op��o e pressione ''enter'', onde pedra = 0, papel = 1, e tesoura = 2:");
		escolhaJogador = leitor.nextInt();
		
		///////////////////////////Jogador escolheu pedra////////////////////////////
		
		if (escolhaJogador == 0) {
		    if (escolhaComputador == 0) {
		        System.out.print(" Ambos escolheram pedra, EMPATE!");
		    }
		    
		    else if (escolhaComputador == 1) {
		        System.out.print(" Computador escolheu papel e jogador pedra, VOC� FOI EMBRULHADO!");
		    }
		    
		    else {
		        System.out.print(" Computador escolheu tesoura e jogador pedra, VOC� ESMAGOU!");
		    
		    }
		
		}
		//////////////////////////////////Jogador escolheu papel/////////////////////
		else if (escolhaJogador == 1) {
		    if (escolhaComputador == 0) {
		        System.out.print(" Computador escolheu pedra e jogador papel, VOC� EMBRULHOU!");
		    }
		    
		    else if (escolhaComputador == 1) {
		        System.out.print(" Ambos escolheram papel, EMPATE!");
		    }
		    
		    else {
		        System.out.print(" Computador escolheu tesoura e jogador papel, VOC� FOI CORTADO!");
		    
		    }
		
		}
		//////////////////////////////////Jogador escolheu tesoura//////////////////
		
		else if (escolhaJogador == 2) {
		    if (escolhaComputador == 2) {
		        System.out.print(" Computador escolheu pedra e jogador tesoura, VOC� FOI ESMAGADO!");
		    }
		    
		    else if (escolhaComputador == 1) {
		        System.out.print(" Computador escolheu papel e jogador tesoura, VOC� CORTOU!");
		    }
		    
		    else {
		        System.out.print(" Ambos escolheram tesoura, EMPATE!");
		    
		    }
		
		/////////////////////////////Em caso de valor n�o reconhecido//////////////
		
		}
		
		else {
		        System.out.print(" Valor n�o reconhecido, deve-se colocar um n�mero entre 0 e 2");
		}
		
	}
}