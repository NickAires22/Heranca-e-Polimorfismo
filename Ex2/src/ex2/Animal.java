package ex2;

public class Animal {
    
    protected String nome;
    protected String raca;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public String toString() {
        return "Animal{" + "nome=" + nome + ", raca=" + raca + '}';
    }
    
    public void caminha(){
        System.out.println("Caminhando");
    }
}
