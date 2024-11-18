package encapsulamento;

import java.math.BigDecimal;

public class ContaBancaria {
    private BigDecimal saldo;
    private String titular;

    protected ContaBancaria(){
        this.saldo = new BigDecimal(0);
    }

    public ContaBancaria(String pTitular){
        this();
        this.titular = pTitular;
    }

    public BigDecimal sacar(BigDecimal pValorParaSacar){
        if(this.saldo.compareTo(BigDecimal.ZERO) == 1 && this.saldo.compareTo(pValorParaSacar) == 1){
            this.saldo.subtract(pValorParaSacar);
        }
        return this.saldo;
    }

    public BigDecimal depositar(BigDecimal pValorParaDepositar){
        this.saldo = this.saldo.add(pValorParaDepositar);
        return this.saldo;
    }

    public BigDecimal getSaldo() {
        return this.saldo;
    }

    protected void setSaldo(BigDecimal pSaldo) {
        this.saldo = pSaldo;
    }

    public String getTitular() {
        return this.titular;
    }

    protected void setTitular(String pTitular) {
        this.titular = pTitular;
    }

}
