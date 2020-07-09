package ex3;

public class Vip extends Ingresso{
    
    public double valor(){
    this.preco = this.preco + 50;
    return this.preco;
}
    @Override
    public void imprimeNota(){
        System.out.println("Nota\n"
                + "\nVIP: R$" + this.preco);
    }
}
