package it.unive.PO1.tutorato.generics;

import java.util.ArrayList;
import java.util.List;

public class Battle {

    public static void main(String[] args) {
        // Il codice compila ma lancia un errore perché marvels[1] non è un MarvelSuperhero
        /*
        MarvelSuperhero[] marvels = new MarvelSuperhero[2];
        marvels[0] = new IronMan();
        Object[] o = marvels; // andiamo a salvare la reference dell'array (aliasing) e non una copia
        o[1] = "stringa";
        marvels[1].doSuperStuff();
        */

        // invarianza non si può fare come prima, il codice non compila
        /*
        List<MarvelSuperhero> avengers = new ArrayList<>();
        List<Object> o2 = avengers;
         */

        SuperTeam<MarvelSuperhero> avengers = new SuperTeam<>();
        SuperTeam<DCSuperhero> justiceLeague = new SuperTeam<>();
        justiceLeague.add(new Flash());

        List<?> aliens = new ArrayList<>();
        List<? extends Superhero> se = justiceLeague; // i wildcard sono covarianti quindi posso salvare justiceLeague in quanto è un sottotipo di Superhero

        // se.add(new Superman()); // non compila in quanto non so che tipo contiene (è sotto Superhero, ma quanto sotto?)
        Superhero superhero1 = se.get(0); // posso leggere perché so che al massimo contiene Superhero

        List<? super Superhero> ss = new ArrayList<>();
        // ss.add(new Object()); // non compila perché non so che tipo contiene (è sopra Superhero, ma quanto sopra?)
        ss.add(new IronMan()); // compila perché è sottotipo di Superhero
        ss.add(new Superman());
        // Superhero superhero2 = ss.get(0); // non compila perché non so che tipo contiene (è sopra Superhero, ma quanto sopra?)
        Object superhero2 = ss.get(0); // compila perché è alla gerarchia dei tipi

        IronMan i = new IronMan();

        System.out.println(i.equals(new IronMan()));
        try {
            System.out.println(i == i.clone()); // returns false
        } catch (Exception e){
            System.out.println("ERROR");
        }

        i.saluteStanLee();


        System.out.println(new IronMan());
        System.out.println(new IronMan());

        String s = "ciao";
        String t = s.replace('o', 'u');
        System.out.println(s);


        // * Superhero.comboAttack(new IronMan(), new Superman());

    }
}
