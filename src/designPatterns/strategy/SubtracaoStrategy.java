package designPatterns.strategy;

public class SubtracaoStrategy implements CalculoStrategy {

    @Override
    public void calcular(int pRef1, int pRef2) {
        System.out.println("O resultado da subtração é " + (pRef1 - pRef2));
    }

}
