package abstracao;

public class Retangulo extends FormaGeometrica {

    private double base;
    private double altura;

    @Override
    public void calcularArea() {
        double lArea = base * altura;
        System.out.println("A área do retangulo é " + lArea);
    }

    @Override
    public void calcularPerimetro() {
        double lPerimetro = base + base + altura + altura;
        throw new UnsupportedOperationException("O perímetro do retangulo é " + lPerimetro);
    }
    
}
