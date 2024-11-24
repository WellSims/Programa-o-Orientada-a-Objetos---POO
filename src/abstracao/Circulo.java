package abstracao;

public class Circulo extends FormaGeometrica {
    private double raio;
    
    @Override
    public void calcularArea() {
       double lArea = Math.PI * raio * raio;
       System.out.println("O valor da área é " + lArea);
    }

    @Override
    public void calcularPerimetro() {
        double lPerimetro = 2 * Math.PI * raio;
        System.out.println("O valor do perímetro é " + lPerimetro);
    }
    
}
