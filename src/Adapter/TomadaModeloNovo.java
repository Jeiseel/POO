package Adapter;



public class TomadaModeloNovo implements TomadaDeTresPinosIF{

	@Override
	public void conectar(ConectorDeTresPinos conector) {
		System.out.println(conector.getDescricao()+" carregando em uma tomada de tres pinos...");		
	}

}
