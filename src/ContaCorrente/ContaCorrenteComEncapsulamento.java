package ContaCorrente;

public class ContaCorrenteComEncapsulamento {
	private int saldo;
	private int chequeEspecial;
	
	public ContaCorrenteComEncapsulamento(int saldo, int chequeEspecial){
		this.saldo = saldo;
		this.chequeEspecial = chequeEspecial;
	}
	
	public void debita (int valor) throws Exception{
		if (valor <= 0){
			throw new Exception("Não podemos debitar um valor negativo ou zero! Valor: " + valor);
		}
		else if (valor > (saldo + chequeEspecial)){
			throw new Exception("Operação negada! O cliente não tem saldo sufuciente! Saldo atual:" + (saldo + chequeEspecial));
		}
		else;
			saldo -= valor;
	}
	
	public void credita (int valor) throws Exception {
		if (valor <= 0){
			throw new Exception("Não podemos creditar um valor negativo ou zero! Valor:" + valor);
		}
		else;
			this.saldo += valor;
	}
	
	public int getsaldo(){
		return this.saldo;
	}
	
	// Será que o valor chequeEspecial é importante para outras classes?
	//Não seria melhor encapsular isso em um getSaldoTotal?
	
	//Public int getChequeEspecial(){
	// return this.chequeEspecial;
	// }
	
	public int getSaldoTotal(){
		return this.saldo + this.chequeEspecial;
	}

}

class LojaComEncapsulamento{
	private ContaCorrenteComEncapsulamento minhaConta;
	
	public LojaComEncapsulamento (ContaCorrenteComEncapsulamento minhaConta){
		this.minhaConta = minhaConta;
	}
	
	public void vende (int valor, ContaCorrenteComEncapsulamento contaDoCliente ){
		try{
			contaDoCliente.debita(valor);
			this.minhaConta.credita(valor);
		} catch (Exception e) {
			System.out.println("Execeção:" + e.getMessage());
			e.printStackTrace();
		}
	}
	
	public ContaCorrenteComEncapsulamento getAccount(){
		return this.minhaConta;
	}
}

class main2{
	public static void main(String [] args){
		ContaCorrenteComEncapsulamento contaDoCliente = new ContaCorrenteComEncapsulamento (100, 100);
		ContaCorrenteComEncapsulamento contaDaLoja = new ContaCorrenteComEncapsulamento (1000, 100);
		LojaComEncapsulamento loja = new LojaComEncapsulamento (contaDaLoja);
		loja.vende(100, contaDoCliente);
		loja.vende(150, contaDoCliente);
		loja.vende(0, contaDoCliente);
		loja.vende(-10, contaDoCliente);
		
		System.out.println("Saldo:" + contaDoCliente.getsaldo());
		System.out.println("Saldo + cheque especial:" +contaDoCliente.getSaldoTotal());
	}	
}