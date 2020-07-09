package ex3;

import javax.swing.JOptionPane;

public class Ex3 {

    public static void main(String[] args) {
        int executar;
        
        executar = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para comprar um ingresso padrão"
                + "\nDigite 2 para comprar um ingresso Vip"));
        
        switch(executar){
            case 1:
                Normal a = new Normal();
                a.imprimeNota();
                break;
            case 2:
                Vip b = new Vip();
                b.valor();
                int exe;
                exe = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para ingresso Vip no Camarote Inferior"
                        + "\nDigite 2 para ingresso Vip no Camarote Superior"));
                        switch(exe){
                            case 1:
                                CamaroteInf c = new CamaroteInf();
                                c.imprimeNota();
                                break;
                            case 2:
                                CamaroteSup d = new CamaroteSup();
                                d.valor();
                                d.imprimeNota();
                                break;
                            default:
                                JOptionPane.showMessageDialog(null,"Digite um número valido!!!!");
                                b.imprimeNota();
                                break;
                        }
                break;
            default:
                JOptionPane.showMessageDialog(null,"Digite um número valido!!!!");
                break;
        }
    }
    
}
