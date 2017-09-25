package Facade;

import Empregado.Administradora;
import Empregado.Baba;
import Empregado.ConselheiroTitular;
import Empregado.Cozinheira;
import Empregado.Domestica;
import Empregado.Motorista;

public class Mae {
	
	private Administradora adm;
	private Baba baba;
	private ConselheiroTitular conselho;
	private Cozinheira cozinheira;
	private Domestica domestica;
	private Motorista motorista;
	
	public Mae(){
		adm = new Administradora();
		baba = new Baba();
		conselho = new ConselheiroTitular();
		cozinheira = new Cozinheira();
		domestica = new Domestica();
		motorista = new Motorista();
	}
	
	public void cuidarDaFamilia(){
		adm.pagarContas();
		conselho.resolverConflitos();
		cozinheira.cozinhar();
		domestica.lavarPratos();
		domestica.lavarRoupas();
		domestica.engomar();
		domestica.faxina();
	}
	
	public void cuidarDoFilho(){
		adm.pagamento();
		baba.darColo();
		cozinheira.cozinhar();
		domestica.lavarRoupas();
		domestica.lavarPratos();
		domestica.faxina();
		domestica.engomar();
		motorista.dirigir();
	}
	

}
