package ex4;

import javax.swing.JOptionPane;

public class Ex4 {

    public static void main(String[] args) {
        int execucao;
        
        
        Novo novo = new Novo();
        Velho velho = new Velho();

        novo.setLocalizacao("Ribeirão Pires");
        novo.setPreco(500000);
        novo.setAdicional(100000);
        velho.setLocalizacao("Mauá");
        velho.setPreco(500000);
        velho.setDesconto(100000);
        
        execucao = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para Imovel Novo \nDigite 2 para Imovel Velho"));
        switch(execucao){
            case 1:
                novo.calcAdic();
                novo.gera();
                break;
            case 2:
                velho.calcDesc();
                velho.gera();
                break;
            default:
                break;
        }
    }
    
}
