package it.unive.PO1.tutorato.exceptions;

import java.util.List;

public abstract class Game {
    protected final String allowedCharacters;

    protected Game(String s){
        this.allowedCharacters = s;
    }

    abstract boolean move(String s) throws RuleViolationException;

}
