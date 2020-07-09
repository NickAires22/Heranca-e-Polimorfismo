package ex1;

public class Assistente extends Funcionario{ 
    public void mostra_dados(){
        System.out.println("\nInformações do Assistente:\n"
                + "\nNome: " + getNome()
                + "\nIdade: " + getIdade()
                + "\nMatricula: " +getMatricula()
                + "\nSalário: R$" + getSalario());
}
}
