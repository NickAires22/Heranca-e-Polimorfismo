package ex4;

import javax.swing.JOptionPane;

public class Imovel {
    public double preco;
    public String localizacao;
   
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
    
        public void gera(){
        JOptionPane.showMessageDialog(null, "Imovel"
                + "\n\nEndereço: "+ this.getLocalizacao()
                + "\nCondição: " 
                + "\nTotal: R$"+ this.preco);
    }
    
}
