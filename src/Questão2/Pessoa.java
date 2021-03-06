package Quest�o2;
// QUEST�O 2
public class Pessoa {
	
	 String nome;
	private int idade;
	private double altura;
	private double peso;
	private String sexo;
	public boolean Cliente;
	public String nascimento;
	public String salario;

	public Pessoa(String nome2, int dia, int mes, int ano, float salario2){
		this.nome ="";
		this.idade = 0;
		this.altura = 0.0;
		this.peso = 0.0;
		this.sexo = "";
	}
	
	public Pessoa(String nome,int idade,double altura,double peso, String sexo){
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
		this.sexo = sexo;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public int getIdade(){
		return this.idade;
	}
	
	public double getAltura(){
		return this.altura;
	}
	
	public double getPeso(){
		return this.peso;
	}
	
	public String getSexo(){
		return this.sexo;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	
	public void setIdade(int idade){
		this.idade = idade;
	}
	
	public void setAltura(double altura){
		this.altura = altura;
	}
	
	public void setPeso(double peso){
		this.peso = peso;
	}
	
	public void setSexo(String sexo){
		this.sexo = sexo;
	}
	
	public double calculaImc(){
		return this.peso/(this.altura*altura);
	}
	
	public String toString(){
		double imc = calculaImc();
		if(imc <= 18.5){
			return "\n Nome:" + nome + "Idade:" + idade + "\n Abaixo Do Peso Normal!!";
		}
		else if(18.5 <  imc && imc <= 25){
			return "\n Nome:" + nome + "\n Idade:" + idade + "\n Peso Normal!!";
		}
		else if(25 < imc && imc <= 30){
			return "\n Nome:" + nome + "\n Idade " + idade + "\n Acima Do Peso Normal!!";
		}
		else if (imc > 30){
			return "\n Nome:" + nome + "\n Idade" + idade + "\n Obesidade";
		}
		return null;
		
	}
		
}
