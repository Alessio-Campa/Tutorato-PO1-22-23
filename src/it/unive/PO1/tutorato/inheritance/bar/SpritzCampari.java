package it.unive.PO1.tutorato.inheritance.bar;

import it.unive.PO1.tutorato.inheritance.cocktail.Cocktail;
import it.unive.PO1.tutorato.inheritance.ingredienti.Ingrediente;

public class SpritzCampari extends Cocktail {

    public SpritzCampari (int campari, int prosecco, int seltz) {
        super (
                new Ingrediente( "Campari", campari),
                new Ingrediente( "Prosecco", prosecco),
                new Ingrediente( "Seltz", seltz)
    );

    }
    @Override
    protected boolean isGoodCocktail() {
        return false;
    }

    public void metodo(){
        System.out.println("Metodo in più");
    }

    public static void main(String[] args) {
        SpritzCampari sc = new SpritzCampari(10,10,10);
        sc.printIngredienti();
    }

}
