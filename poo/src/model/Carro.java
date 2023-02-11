package model;

public class Carro {

    //atributos caracterizam determinado entidade do mundo real
    private String cor;
    private String modelo;
    private Double capacidadeDoTanque;

    public Carro() {
    }

    public Carro(String cor, String modelo, Double capacidadeDoTanque) {
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeDoTanque = capacidadeDoTanque;
    }

    //metodos representam ações e comportamentos que uma determinada entidade pode fazer
    //assinatura de um método - nome + parametros

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public Double getCapacidadeDoTanque() {
        return capacidadeDoTanque;
    }

    public Double calcularValorTanqueCompleto(double precoGasolina) {
        return precoGasolina * getCapacidadeDoTanque();
    }

    //sobrecarga
    public Double calcularValorTanqueCompleto(double precoGasolina, double descontoPorLitro) {
        double precoGasolinaComDesconto = precoGasolina * descontoPorLitro;
        return precoGasolinaComDesconto * getCapacidadeDoTanque();
    }
    
    
}