package ex3;

public class Ingresso {
    public double preco = 50;

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void imprimeNota(){
        System.out.println("Nota\n"
                + "\nIngresso: R$" + this.preco);
    }
}
