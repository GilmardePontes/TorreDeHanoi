package Torre;

public class TorresHanoi {
	int aux; //Ela vai pegar o tamanho de discos
	
	//Cria os Pinos
	private Pino O;
	private Pino T;
	private Pino D;
	
	//Instacia 
	TorresHanoi(int n){
		this.aux=n;
		O=new Pino(n);
		O.preencher();
		T=new Pino(0);
		D=new Pino(0);
	}
	
	public void mover(Pino p1,Pino p2) {
		p2.insere(p1.retira());//O inserir pega o retira
	}
	public void exibira() {	//Simplimente vai exibir 
		
		System.out.printf("O"+"");
		O.exibir();
		System.out.printf("T"+"");
		T.exibir();
		System.out.printf("D"+"");
		D.exibir();
		System.out.println("------------------------------------------");
	}
	
	public void resolver(int n,Pino O, Pino D, Pino T) { //Precisa ser entendido
		if (n > 0) {
			resolver(n - 1, O, T, D);
			exibira();
			mover(O, D);
			resolver(n - 1, T, D, O);
		}
	
	}
	public void solucao(){ //"Otimizar"
		resolver(aux,O,D,T);
		exibira();
	}
}
