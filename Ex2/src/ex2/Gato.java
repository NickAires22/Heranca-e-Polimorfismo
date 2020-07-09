package ex2;

public class Gato extends Animal{
    public void mia(){
        System.out.println("MIAU");
    }
    
    @Override
    public void caminha(){
        System.out.println("O gato caminha");
    }
}
