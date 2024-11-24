package designPatterns.factoryMethod;

public class Caminhao implements Transporte {

    @Override
    public void carregar() {
        System.out.println("Caminhão carregado por caixas");
        entregar();
    }

    @Override
    public void entregar() {
        System.out.println("Caminhão chegou ao ponto de entraga através de rodovia.");
    }

}
