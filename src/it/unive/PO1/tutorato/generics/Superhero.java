package it.unive.PO1.tutorato.generics;

public abstract class Superhero {
    abstract void doSuperStuff() throws RuntimeException;
    void saveWorld(){
        System.out.println("Saving world...");
    }

    public static <S, T> void comboAttack(S a, T b){
        System.out.println(a);
        System.out.println(b);
    }

    public static <S extends Superhero, T extends Superhero> void comboAttack(S a, T b){
        a.doSuperStuff();
        b.doSuperStuff();
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Superhero;
    }
}
