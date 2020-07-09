package ex4;

import javax.swing.JOptionPane;

public class Velho extends Imovel{
    private double desconto;
    private String condicao = "velho";
    
    public String getCondicao() {
        return condicao;
    }

    public void setCondicao(String condicao) {
        this.condicao = condicao;
    }
    
    
    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
    
    public double calcDesc(){
    this.preco = this.preco - this.desconto;
    return this.preco;
}
    @Override
    public void gera(){
        JOptionPane.showMessageDialog(null, "Imovel"
                + "\n\nEndereço: "+ this.getLocalizacao()
                + "\nCondição: " +this.getCondicao()
                + "\nTotal: R$"+ this.preco);
    }
    
}
