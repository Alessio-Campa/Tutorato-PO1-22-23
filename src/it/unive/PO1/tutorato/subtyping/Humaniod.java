package it.unive.PO1.tutorato.subtyping;

public abstract class Humaniod {
    public String name;
    public int power;

    public Humaniod(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public String speak(){
        return "Ciao";
    }

    abstract void attack();

    public static void greet(){
        System.out.println("We are humanoids");
    }
}
