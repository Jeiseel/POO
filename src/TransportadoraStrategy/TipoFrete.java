package TransportadoraStrategy;

public enum TipoFrete {
	NORMAL {
		public Frete obterFrete() {
			return new Normal();
		}
	},
	SEDEX {
		public Frete obterFrete() {
			return new Sedex();
		}
	};
	
	public Frete obterFrete() {
		// TODO Auto-generated method stub
		return null;
	}
}
