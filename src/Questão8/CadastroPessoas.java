package Questão8;
import java.util.ArrayList;

public class CadastroPessoas {
	private ArrayList<Pessoa8> lista;
	
	public CadastroPessoas(){
		lista = new ArrayList<Pessoa8>();
	}
	public CadastroPessoas(ArrayList<Pessoa8> p){
		lista = p;
	}
	
	public void Cadastra(Pessoa8 pes){
		lista.add(pes);
	}
	
	public String imprimeCadastro(){
		String msg = "Cadastra Pessoa";
		for (Pessoa8 p: lista){
			if(p instanceof Cliente){
				Cliente c = (Cliente) p;
				msg += c.imprimeDados() + "\n";
			}
			else if (p instanceof Funcionario){
				if (p instanceof Gerente){
					Gerente g = (Gerente) p;
					msg += g.imprimeDados() + "\n";
				}
				else {
					Funcionario f = (Funcionario) p;
					msg += f.imprimeDados() + "\n";
				}
			}
		}
		return msg;
	}

}
