package ex2;

public class Cachorro extends Animal{
    public void late(){
        System.out.println("AUAUAU");
    }
    
    @Override
    public void caminha(){
        System.out.println("O cachorro caminha");
    }
}
