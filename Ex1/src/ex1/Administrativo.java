package ex1;

public class Administrativo extends Assistente{
    private String turno;
    private double adicional;
    
    public double getAdicional() {
        return adicional;
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }
    
    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
    
    public double aumento(){
        if ("Noite".equals(turno)){
            this.salario = this.salario + this.adicional;
        } else {
            this.salario = this.salario;
        }
        return this.salario;
    }
    
    @Override
    public void mostra_dados(){
        System.out.println("\nInformações do Assistente Administrativo:\n"
                + "\nNome: " + getNome()
                + "\nIdade: " + getIdade()
                + "\nMatricula: " +getMatricula()
                + "\nTurno: " + getTurno()
                + "\nSalário: R$" + getSalario());
}
}
