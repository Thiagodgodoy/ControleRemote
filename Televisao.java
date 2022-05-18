/*Crie uma classe Televisao e uma classe ControleRemoto que pode controlar o volume e
trocar os canais da televisão. O controle de volume permite:
 aumentar ou diminuir a potência do volume de som em uma unidade de cada vez;
 aumentar e diminuir o número do canal em uma unidade
 trocar para um canal indicado;
 consultar o valor do volume de som e o canal selecionado*/

package Controle;
import java.util.Scanner;

public class Televisao {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		Controle remoto = new Controle();
		int opcao = 10;
		do {
			switch (opcao){
			case 7 -> remoto.ligar();
			case 5 -> remoto.desligar();
			case 8 -> remoto.aumentarCanal();
			case 2 -> remoto.diminuirCanal();
			case 6 -> remoto.aumentarVolume();
			case 4 -> remoto.diminuirVolume();
			case 9 -> remoto.ligarMudo();
			case 3 -> remoto.desligarMudo();
			case 1 -> remoto.trocarCanal();
			case 0 -> remoto.infoAtual();
			} opcao = sc.nextInt();		
		} while (opcao != 13);	
	sc.close();
	}
}

