package Adapter;

public class ObjectAdapter implements TomadaDeTresPinosIF {

	private TomadaDeDoisPinosIF tomada;
	
	public ObjectAdapter(){
		tomada = new TomadaModeloAntigo();
	}

	@Override
	public void conectar(ConectorDeTresPinos conector) {
		ConectorDeDoisPinos c = new ConectorDeDoisPinos(conector.getDescricao());
		tomada.conectar(c);
		
	}
	
}
