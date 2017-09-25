package Adapter;



public class TomadaModeloAntigo implements TomadaDeDoisPinosIF{

	@Override
	public void conectar(ConectorDeDoisPinos conector) {
		System.out.println(conector.getDescricao()+" carregando em uma tomada de dois pinos...");		
	}
	
}
