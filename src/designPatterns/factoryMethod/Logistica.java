package designPatterns.factoryMethod;

public abstract class Logistica {

    public void iniciarEntrega() {
        Transporte lTransporte = criarTransporte();
        lTransporte.carregar();
    }

    protected abstract Transporte criarTransporte();

}
