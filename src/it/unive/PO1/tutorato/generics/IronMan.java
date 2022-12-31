package it.unive.PO1.tutorato.generics;

public class IronMan extends MarvelSuperhero{

    @Override
    void doSuperStuff() throws RuntimeException {
        System.out.println("[Ironman] Flying, making money, being cool AF");
        throw new RuntimeException();
    }

    void changeSuit(){
        System.out.println("[Ironman] Changing suit");
    }

    @Override
    void saluteStanLee()  {
        this.doSuperStuff();
        System.out.println("[Ironman] Saluting Stan Lee");
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof IronMan;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Hi I'm Ironman";
    }
}
