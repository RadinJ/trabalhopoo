package trabalho.pkgfinal.classes;

import java.io.Serializable;

abstract class Peca implements Serializable{
    private String modelo, marca;
    private double preco, voltagem;
    
    public void aplicarDesc(int prc){
        prc = prc / 100;
        setPreco(getPreco() - getPreco() * prc);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(double voltagem) {
        this.voltagem = voltagem;
    }
    
}
