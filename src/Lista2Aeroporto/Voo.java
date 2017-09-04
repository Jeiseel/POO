package Lista2Aeroporto;

import java.util.Date;

public class Voo {
	private int num;
	private  TipoVoo tipo;
	private String empresa;
	private Date horario;
	
	public Voo(int num, String empresa, Date horario, TipoVoo tipo){
		this.num = num;
		this.empresa = empresa;
		this.horario = horario;
		this.tipo = tipo;
		
	}
	
	public String getEmpresa(){
		return this.empresa;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public TipoVoo getTipo() {
		return tipo;
	}

	public void setTipo(TipoVoo tipo) {
		this.tipo = tipo;
	}

	public Date getHorario() {
		return horario;
	}

	public void setHorario(Date horario) {
		this.horario = horario;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	
	
}
