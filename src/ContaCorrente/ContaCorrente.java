package ContaCorrente;

public class ContaCorrente {
	public int saldo;
	public int chequeEspecial;
	
	public ContaCorrente(int saldo, int chequeEspecial){
		this.saldo = saldo;
		this.chequeEspecial = chequeEspecial;
	}

}

class Loja {
	public ContaCorrente minhaConta;
	
	public Loja (ContaCorrente minhaConta){
		this.minhaConta = minhaConta;
	}
}

class Main {
	public static void main (String [] args){
		ContaCorrente c1 = new ContaCorrente(500, 100);
	}
}
