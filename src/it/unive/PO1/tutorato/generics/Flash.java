package it.unive.PO1.tutorato.generics;

import java.util.Objects;

public class Flash extends DCSuperhero{
    public Integer speed = null;
    public Integer velocity = null;

    @Override
    void doSuperStuff() {
        double objSpeed = speed;
        System.out.println("[Flash] running, shooting lightnings, saving the world talking");
    }
}
