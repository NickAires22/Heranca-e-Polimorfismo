package ex3;

public class CamaroteInf extends Vip{
    public String lugar = "Inferior";
    
    @Override
    public void imprimeNota(){
        System.out.println("Nota\n"
                + "\nINGRESSO VIP"
                + "\nCamarote Inferior: R$" + this.preco);
    }
}
