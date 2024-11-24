package abstracao;

public class Circulo extends FormaGeometrica {
    private double raio;
    
    @Override
    public void calcularArea() {
       double lArea = Math.PI * raio * raio;
       System.out.println("A área do circulo é " + lArea);
    }

    @Override
    public void calcularPerimetro() {
        double lPerimetro = 2 * Math.PI * raio;
        System.out.println("O perímetro do circulo é " + lPerimetro);
    }

    public double getRaio() {
        return this.raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
}
