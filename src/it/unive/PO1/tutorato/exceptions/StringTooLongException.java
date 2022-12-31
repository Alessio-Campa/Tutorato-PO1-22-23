package it.unive.PO1.tutorato.exceptions;

public class StringTooLongException extends RuleViolationException{
    public StringTooLongException(String s) {
        super(s);
    }
}
