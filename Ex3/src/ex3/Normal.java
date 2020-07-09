package ex3;

public class Normal extends Ingresso{
    @Override
    public void imprimeNota(){
        System.out.println("Nota\n"
                + "\nPadrão: R$" + this.preco);
    }
}
