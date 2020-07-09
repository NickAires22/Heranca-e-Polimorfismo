package ex1;

public class Ex1 {

    public static void main(String[] args) {
        Tecnico informatica = new Tecnico();
        Administrativo admin = new Administrativo();
        
        informatica.setMatricula(1);
        informatica.setNome("Nicolas Aires");
        informatica.setIdade(17);
        informatica.setSalario(20000);
        informatica.setAdicional(500);
        informatica.aumento();
        informatica.mostra_dados();
        
        admin.setMatricula(2);
        admin.setNome("Aires Nicolas");
        admin.setIdade(71);
        admin.setSalario(2000);
        admin.setAdicional(1000);
        admin.setTurno("Noite");
        admin.aumento();
        admin.mostra_dados();
    }
    
}
