package designPatterns.factoryMethod;

public class LogisticaTerrestre extends Logistica {

    @Override
    protected Transporte criarTransporte() {
       return new Caminhao();
    }

}
