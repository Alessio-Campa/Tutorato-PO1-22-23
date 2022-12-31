package it.unive.PO1.tutorato.exceptions;

public class IllegalCharacterException extends RuleViolationException{
    public IllegalCharacterException() {
        super("Illegal character inserted");
    }

    public IllegalCharacterException(String message) {
        super("Illegal character inserted: " + message);
    }
}
