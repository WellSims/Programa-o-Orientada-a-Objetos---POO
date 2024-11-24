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
        System.out.println("O perímetro do retangulo é " + lPerimetro);
    }

    public double getBase() {
        return this.base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }    

}
