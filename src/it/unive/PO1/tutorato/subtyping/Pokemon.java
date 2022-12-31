package it.unive.PO1.tutorato.subtyping;

import java.util.Random;

public class Pokemon implements Transformable{
    private final Random r = new Random();
    public String name;
    public int power;

    public Pokemon(String name, int power) {
        this.name = name;
        this.power = power;
    }

    @Override
    public void powerUp() {
        this.power += r.nextInt(1000);
        System.out.println(this.name + "(Pokemon): AAAAAAAAAAAAAA, new power is " + this.power);
    }
}
