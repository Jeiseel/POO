package Questão8;
import javax.swing.JOptionPane;

public class MainCadastro {
	
	public static void main (String [] args){
		CadastroPessoas cadastro = new CadastroPessoas();
		
		Cliente c1 = new Cliente("Maria", 12, 07, 2000, 000232);
		Cliente c2 = new Cliente("Bastião", 22, 05,1999, 000231);
		Cliente c3 = new Cliente("Jose", 07, 03, 1992, 000515);
		cadastro.Cadastra(c1);
		cadastro.Cadastra(c2);
		cadastro.Cadastra(c3);
		Funcionario f1 = new Funcionario ("Bruna", 03, 07, 2001, 877 );
		Funcionario f2 = new Funcionario ("Igor", 01,12, 2001, 937);
		Funcionario f3 = new Funcionario("Sara", 29, 07, 1992, 932);
		cadastro.Cadastra(f1);
		cadastro.Cadastra(f2);
		cadastro.Cadastra(f3);
		Gerente g1 = new Gerente("Almir", 01, 8, 1991, 0001, "vendas");
		Gerente g2 = new Gerente ("Marcos", 03,5, 1888, 0002,"RH");
		Gerente g3 = new Gerente ("Gil", 04, 8, 1889, 0003, "projetos");
		cadastro.Cadastra(g1);
		cadastro.Cadastra(g2);
		cadastro.Cadastra(g3);
		JOptionPane.showMessageDialog(null, cadastro.imprimeCadastro());
	}
	

}
