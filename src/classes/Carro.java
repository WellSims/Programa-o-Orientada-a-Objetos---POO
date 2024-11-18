package classes;

public class Carro {
    private String marca;
    private String modelo;
    private double velocidadeAtual;

    protected Carro() {
        this.velocidadeAtual = 0.00;
    }

    public Carro(String marca, String modelo) {
        this();
        this.marca = marca;
        this.modelo = modelo;
    }

    public void acelerar(){
        this.velocidadeAtual += 1.00;
    }

    public void frear(){
        if(this.velocidadeAtual != 0.00){
            this.velocidadeAtual -= 1.00;
        }
    }

    public void exibirInformacoes(){
        System.out.println("MARCA: " + this.marca);
        System.out.println("MODELO: " + this.modelo);
        System.out.println("VELOCIDADE ATUAL:" + this.velocidadeAtual);
    }
}
