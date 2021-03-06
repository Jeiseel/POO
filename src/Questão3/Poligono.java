package Quest�o3;
// Quest�o 3
import java.util.ArrayList;

public class Poligono {
	
	ArrayList<Ponto> pol = new ArrayList<Ponto>();
	
	public void add(Ponto p) throws PontoJaExisteException{
		if (this.pol.contains(p))  new PontoJaExisteException("Erro!!");
		pol.add(p);
	}
	public void add(int x, int y ) throws PontoJaExisteException{
		Ponto p = new Ponto(x,y);
		if(this.pol.contains(p)) new PontoJaExisteException("Erro!!");
		pol.add(p);
	}
	public void remuve(Ponto p) throws NaoExisteElemtentoException{
		if(! this.pol.contains(p)) new NaoExisteElemtentoException("Erro");
		pol.remove(p);
	}
	public void remuve(int x, int y) throws NaoExisteElemtentoException{
		Ponto p = new Ponto(x,y);
		if(! this.pol.contains(p)) new NaoExisteElemtentoException("Erro!!");
		pol.remove(p);
	}
	public boolean metContains(Ponto p){
		for (Ponto i: this.pol){
			if (p.equals(i)) return true;
		}
		return false;
	}
	public double areaDoPoligono(){
		double soma = 0;
		for(int k = 0; k < pol.size() -1 ; k ++){
			soma += pol.get(k+1).getY()* pol.get(k).getX() - pol.get(k+1).getX()*pol.get(k).getY();
		}
		return soma/2;
	}
	

}
