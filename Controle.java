/*Crie uma classe Televisao e uma classe ControleRemoto que pode controlar o volume e
trocar os canais da televisão. O controle de volume permite:
 aumentar ou diminuir a potência do volume de som em uma unidade de cada vez;
 aumentar e diminuir o número do canal em uma unidade
 trocar para um canal indicado;
 consultar o valor do volume de som e o canal selecionado*/

package Controle;
import java.util.Scanner;

public class Controle {
	Scanner sc = new Scanner(System.in);
	private int volume;
	private int canal;
	private boolean ligado;
	private boolean tocando;
	
	public Controle() {
		this.volume = 20;
		this.canal = 1;
		this.ligado = false;
		this.tocando = false;
		
	}
	
	public void ligar() {
		this.ligado = true;
		System.out.println("TV LIGADA!");
	}	
	
	public void desligar() {
		this.ligado = false;
		System.out.println("TV DESLIGADA!");
	}
	public void ligarMudo() {
		if (this.getLigado() && this.getVolume() > 0) {
			this.setVolume(0);
			System.out.printf("Volume: %d \n", this.getVolume());
		} else {
			System.out.println("TV nao esta ligada!");
		}
	}
	public void desligarMudo() {
		if (this.getLigado() && this.getVolume() == 0) {
			this.setVolume(20);
			System.out.printf("Volume: %d \n", this.getVolume());
		} else if (this.getLigado()) {
			System.out.println("Mudo nao esta ligado!");
		} else {
			System.out.println("TV nao esta ligada!");
		}
	}
	public void aumentarVolume() {
		if (this.getLigado()) {
			this.setVolume(this.getVolume() + 5);
			System.out.printf("Volume: %d \n", this.getVolume());
		} else {
			System.out.println("TV nao esta ligada!");
		}
	}
	public void diminuirVolume() {
		if (this.getLigado()) {
			this.setVolume(this.getVolume() - 5);
			System.out.printf("Volume: %d \n", this.getVolume());
		} else {
			System.out.println("TV nao esta ligada!");
		}
	}
	public void aumentarCanal() {
		if (this.getLigado()) {
			this.setCanal(this.getCanal() + 1);
			System.out.println("Canal atual: " + this.getCanal());
		} else {
			System.out.println("TV nao esta ligada!");
		}
	}
	public void diminuirCanal() {
		if (this.getLigado()) {
			this.setCanal(this.getCanal() - 1);
			System.out.println("Canal atual: " + this.getCanal());
		} else {
			System.out.println("TV nao esta ligada!");
		}
	}
	public void trocarCanal() {
		if (this.getLigado()) {
			System.out.println("Digite o canal: ");
			this.setCanal(sc.nextInt());
			System.out.println("Canal atual: " + this.getCanal());
		} else {
			System.out.println("TV nao esta ligada!");
		}
	}
	public void infoAtual() {
		if (this.getLigado()) {
			System.out.printf("Canal: %d  |  Volume: %d", this.getCanal(), this.getVolume());
		} else {
			System.out.println("TV nao esta ligada!");			
		}
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public int getCanal() {
		return canal;
	}
	public void setCanal(int canal) {
		this.canal = canal;
	}

	public boolean getLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public boolean getTocando() {
		return tocando;
	}

	public void setTocando(boolean tocando) {
		this.tocando = tocando;
	}
	
}
