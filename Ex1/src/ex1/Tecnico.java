package ex1;

public class Tecnico extends Assistente{
    private double adicional;
       
    public double getAdicional() {
        return adicional;
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }
    
    public double aumento(){
        this.salario = this.salario + this.adicional;
        return this.salario;
    }
    
    @Override
    public void mostra_dados(){
        System.out.println("\nInformações do Assistente Técnico:\n"
                + "\nNome: " + getNome()
                + "\nIdade: " + getIdade()
                + "\nMatricula: " +getMatricula()
                + "\nSalário: R$" + getSalario());
}
}
    
