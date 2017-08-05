package Questão8;

public class Data {
	int dia;
	int mes;
	int ano;
	
	public Data(int dd, int mm, int aa){
		dia = dd;
		mm = mes;
		aa = ano;
	}
	
	public int getDia(){
		return this.dia;
	}
	public int getMes(){
		return this.mes;
	}
	
	public int getAno(){
		return this.ano;
	}
	
	public String toString(){
		return "\n Dia: " + getDia() + "Mes:" + getMes() + "Ano" + getAno();
	}

}
