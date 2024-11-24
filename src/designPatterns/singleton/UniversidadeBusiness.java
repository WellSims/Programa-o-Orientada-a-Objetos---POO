package designPatterns.singleton;

import composicao.Universidade;
import utils.Business;

public final class UniversidadeBusiness extends Business<Universidade>{

    private static UniversidadeBusiness instancia;

    private UniversidadeBusiness(){}

	public static synchronized UniversidadeBusiness getInstancia() {
		if (instancia == null) {
			instancia = new UniversidadeBusiness();
		}
		return instancia;
	}

	@Override
	public void validar(Universidade pModel) {
		if(pModel.getNome() == null || pModel.getNome().isBlank()){
			System.out.println("O nome da Universidade é inválido");
		}
	}

}
