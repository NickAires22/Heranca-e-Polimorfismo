package ex3;

public class CamaroteSup extends Vip{
    public String lugar = "Superior";
    
    @Override
    public double valor(){
        this.preco = this.preco + 100;
        return this.preco;
} 
    
    @Override
    public void imprimeNota(){
        System.out.println("Nota\n"
                + "\nINGRESSO VIP"
                + "\nCamarote Superior: R$" + this.preco);
    }
}
