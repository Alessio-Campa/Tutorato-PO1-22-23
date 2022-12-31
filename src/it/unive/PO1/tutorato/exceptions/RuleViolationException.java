package it.unive.PO1.tutorato.exceptions;

public class RuleViolationException extends Exception{
    RuleViolationException(String s){
        super(s);
    }

    RuleViolationException(){
        super("Rule violated");
    }
}
