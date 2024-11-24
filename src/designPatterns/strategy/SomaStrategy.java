package designPatterns.strategy;

public class SomaStrategy implements CalculoStrategy {

    @Override
    public void calcular(int pRef1, int pRef2) {
        System.out.println("O resultado da soma é " + (pRef1 + pRef2));
    }

}
