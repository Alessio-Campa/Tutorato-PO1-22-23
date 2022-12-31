package it.unive.PO1.tutorato.subtyping;

import java.util.Random;

public class Sayan extends Humaniod implements Transformable{
    private final Random r = new Random();

    public Sayan(String name, int power) {
        super(name, power);
    }

    @Override
    void attack() {
        System.out.println(this.name + "(Sayan) attacks with " + this.power + " power" );
    }

    @Override
    public String speak(){
        return "AAAAAAAAAA";
    }

    public void powerUp(){
        this.power += r.nextInt(1000);
        System.out.println(this.name + "(Sayan): AAAAAAAAAAAAAA, new power is " + this.power);
    }

    public static void greet(){
        System.out.println("AAAAAAAAAAAAAA");
    }
}
