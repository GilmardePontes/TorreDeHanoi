package Torre;

public class Pino {
	private int toppo;  //Ele administra a quantidade de discos
	private int torre[];//vetor do pinos
	
	public Pino(int num) {	
		this.toppo=num;		//Recebe a quantidade de discos
		this.torre=new int[num];	//Faz o vetor de acordo com a quantidade
	}
	
	public void preencher() {
		int aux=toppo;				//variavel auxiliar
		for(int i=0;i<toppo;i++) {
			this.torre[i]=aux; //Preenche o vetor da torre
			aux--;	
		}
	}
	//inserir
	public void insere(int a) {	
		int torreAux[]=new int[toppo];	//Cria um vetor auxiliar 
		for(int k=0; k<toppo; k++) {
			torreAux[k]=torre[k];	//Copia o conteudo do vetor original
		}
		this.toppo++;		//Aumenta o tamanho da torre
		torre=new int[toppo];	//Cria um vetor por cima do original
		for(int k=0;k<toppo-1;k++) {
			torre[k]=torreAux[k];	//passa as informações da auxiliar para o original
		}
		torre[toppo-1]=a;		//acrescenta o ultimo caractere
		
	}
	

	public int retira() {
		int x=torre[toppo-1]; //pega a ultima posição
		this.toppo--; // decremneta o o tamanho do vetor
		return x; // retorna a ultima posição
	}
	
	public void exibir() {  //vai so exibir
		System.out.printf("*");
		for(int i=0;i<toppo;i++) {
			System.out.print(torre[i]);
		}	
		System.out.println("");
	}	
}

