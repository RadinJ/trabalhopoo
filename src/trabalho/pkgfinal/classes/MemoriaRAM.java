package trabalho.pkgfinal.classes;

import javax.swing.JOptionPane;

public class MemoriaRAM extends Peca{
    private int frequencia, capacidade;
    
    @Override
    public void aplicarDesc(int prc){
        JOptionPane.showMessageDialog(null, "Nao tem desconto em memória RAM!");
    }

    public int getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(int frequencia) {
        this.frequencia = frequencia;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

}
