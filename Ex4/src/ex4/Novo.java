package ex4;

import javax.swing.JOptionPane;

public class Novo extends Imovel{
    private double adicional;
    private String condicao = "novo";
    
    public String getCondicao() {
        return condicao;
    }

    public void setCondicao(String condicao) {
        this.condicao = condicao;
    }
    
    
    public double getAdicional() {
        return adicional;
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }
    
    public double calcAdic(){
    this.preco = this.preco + this.adicional;
    return this.preco;
}
    @Override
    public void gera(){
        JOptionPane.showMessageDialog(null, "Imovel"
                + "\n\nEndereço: "+ this.getLocalizacao()
                + "\nCondição: " + this.getCondicao()
                + "\nTotal: R$"+ this.preco);
}
}
