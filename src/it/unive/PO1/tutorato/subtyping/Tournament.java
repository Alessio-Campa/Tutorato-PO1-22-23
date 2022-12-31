package it.unive.PO1.tutorato.subtyping;

import it.unive.PO1.tutorato.Car;

public class Tournament {

    private static void checkWin(Humaniod a, Humaniod b){
        if(a.power > b.power){
            System.out.println(a.name + " wins!");
        }else if (a .power < b.power) {
            System.out.println(b.name + " wins!");
        }else{
            System.out.println("Tie match!");
        }
    }

    static void fight(Humaniod a, Humaniod b){
        a.attack();
        Sayan sa, sb;
        if(a instanceof Sayan){
            sa = (Sayan) a;
            sa.powerUp();
        }

        b.attack();
        if(b instanceof Sayan){
            sb = (Sayan) b;
            sb.powerUp();
        }

        System.out.println(a.power);
        checkWin(a, b);
    }

    public static void fight(Transformable a, Transformable b){
        a.powerUp();
        b.powerUp();
        if(a instanceof Humaniod && b instanceof Humaniod){
            checkWin((Humaniod) a, (Humaniod) b);
        } else{
            System.out.println("Fights not between humanoids are illegal");
        }
    }

    public static void fight(Sayan a, Human b){}

    public static void fight(Human a, Sayan b){}

    public static void fight(Object a, Object b){}

    public static void fight(Sayan a, Sayan b){}

    public static void main(String[] args) {
        Human pa = new Human("personaA", 100);
        Human pb = new Human("personaB", 200);
        Human chichi = new Human("Chichi", 100000);
        Sayan goku = new Sayan("Goku", 9001);
        Sayan vegeta = new Sayan("Vegeta", 9001);
        Pokemon pikachu = new Pokemon("Pikachu", 100);
        Pokemon rayquaza = new Pokemon("Raiquaza", 100);


        fight(pa, pb);            // chiama il metodo humanoid-humanoid
        fight(goku, chichi);      // chiama il metodo sayan-human
        fight(chichi, goku);      // chiama il metodo human-sayan
        fight(goku, vegeta);      // chiama il metodo sayan-sayan
        fight(goku, pikachu);     // chiama il metodo transformable-transformable
        fight(rayquaza, pikachu); // chiama il metodo transformable-transformable

        System.out.println("----");

        Humaniod.greet();
        Humaniod gohan = new Sayan("Goahn", 100000);
        // Dato che greet è un metodo statico, e il tipo statico di gohan è Humanoid
        // l'implementazione di greet() che verrà utilizzata è quella di Humanoid
        gohan.greet();
    }

}
