package it.unive.PO1.tutorato.generics;

import java.util.ArrayList;
import java.util.Iterator;

public class SuperTeam<T extends Superhero> extends ArrayList<T> {

    void presentation(){
        for (T current : this) {
            current.doSuperStuff();
        }
    }


}
