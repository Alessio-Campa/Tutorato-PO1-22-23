package it.unive.PO1.tutorato.inheritance.cocktail;

import it.unive.PO1.tutorato.inheritance.ingredienti.Ingrediente;

abstract public class Cocktail {
    private Ingrediente[] ingredienti;

    // input preso come un array di varargs
    public Cocktail(Ingrediente... ingredienti) {
        this.ingredienti = ingredienti;
    }

    public Ingrediente[] getIngredienti() {
        return this.ingredienti;
    }

    public static void mixCocktail(Cocktail a, Cocktail b){
        a.printIngredienti();
        System.out.println("AND");
        b.printIngredienti();
    }

    protected abstract boolean isGoodCocktail();

    // il metodo è final quindi non può essere esteso
    protected final void printIngredienti(){
        for(int i = 0; i < this.ingredienti.length; i++){
            System.out.print(this.ingredienti[i].getName() + " ");
        }
        System.out.println();
    }
}
