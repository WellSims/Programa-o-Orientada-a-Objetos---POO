package designPatterns.factoryMethod;

public class Navio implements Transporte {

    @Override
    public void carregar() {
        System.out.println("Návio carregado com containers.");
        entregar();
    }

    @Override
    public void entregar() {
        System.out.println("Návio chegou no porto de destino.");
    }

}
