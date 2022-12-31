package it.unive.PO1.tutorato.inheritance.cocktail;

import it.unive.PO1.tutorato.inheritance.bar.SpritzCampari;
import it.unive.PO1.tutorato.inheritance.ingredienti.Ingrediente;

public class SpritzAperol extends Cocktail{
    SpritzAperol(int aperol, int prosecco, int seltz){
        super(
            new Ingrediente("Aperol", aperol),
            new Ingrediente("Prosecco", prosecco),
            new Ingrediente("Seltz", seltz)
        );
    }

    //  Non è possibile definire il metodo private in quanto la sua visibilità sarebbe minore di quella della superclasse
    /*
    private boolean isGoodCocktail(){
        return true;
    }*/

    @Override
    protected boolean isGoodCocktail() {
        Ingrediente[] ing = getIngredienti();
        return ing[0].getQuantity() == ing[1].getQuantity() && ing[0].getQuantity() == ing[2].getQuantity();
    }

    // il metodo è final nella superclasse quindi non si può estendere
    /*
    protected void printIngredienti(){
        for(int i = 0; i < this.ingredienti.length; i++){
            System.out.print(this.ingredienti[i].getName() + ", ");
        }
        System.out.println();
    }*/


    public static void main(String[] args) {
        SpritzAperol sa = new SpritzAperol(11, 10 , 10);
        System.out.println(sa.isGoodCocktail());
        System.out.println("---");
        sa.printIngredienti();

        Cocktail.mixCocktail(sa, new SpritzCampari(10,10,10));
    }

}
