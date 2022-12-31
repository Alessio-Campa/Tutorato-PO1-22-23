package it.unive.PO1.tutorato.subtyping;

// Non implementando tutti i metodi dell'interfaccia deve essere astratta
public abstract class Transformer implements Transformable {
    public String name = "Bumblebee";

    public void greet(){
        System.out.println("Hi im " + this.name);
    }
}

