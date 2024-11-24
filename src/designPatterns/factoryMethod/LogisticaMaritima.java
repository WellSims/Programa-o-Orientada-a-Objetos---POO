package designPatterns.factoryMethod;

public class LogisticaMaritima extends Logistica {

    @Override
    protected Transporte criarTransporte() {
        return new Navio();
    }

}
