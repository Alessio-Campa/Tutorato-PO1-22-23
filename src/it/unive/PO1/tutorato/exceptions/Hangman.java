package it.unive.PO1.tutorato.exceptions;

import it.unive.PO1.tutorato.generics.Spiderman;

import java.util.Scanner;

public class Hangman extends Game{
    private String secretSentence = "this supersecret sentence is the one to guess";
    private String guessedSentence = "";

    protected Hangman(String s) {
        super(s);
        StringBuilder gs = new StringBuilder();
        for(int i = 0; i < this.secretSentence.length(); i++){
            if (this.secretSentence.charAt(i) == ' ')
                gs.append(" ");
            else
                gs.append("_");
        }
        this.guessedSentence = gs.toString();
        System.out.println(this.guessedSentence);
    }

    @Override
    boolean move(String s) throws IllegalCharacterException, StringTooLongException {
        if(s.length() != 1){
            throw new StringTooLongException("String length is wrong");
        }
        if(!this.allowedCharacters.contains(s)){
            //return false;
            throw new IllegalCharacterException(s);
        }
        if (this.secretSentence.contains(s)){
            StringBuilder gs = new StringBuilder();
            for(int i = 0; i < this.secretSentence.length(); i++){
                if(this.secretSentence.charAt(i) == s.charAt(0))
                    gs.append(s);
                else
                    gs.append(this.guessedSentence.charAt(i));
            }
            this.guessedSentence = gs.toString();
        }
        System.out.println(this.guessedSentence);
        return this.guessedSentence.equals(this.secretSentence);
    }


    public static void main(String[] args) {
        Game game = new Hangman("qwertyuiopasdfghjklzxcvbnm");
        boolean win = false;
        while(!win){
            Scanner sc = new Scanner(System.in);
            try {
                win = game.move(sc.nextLine());
            }catch (RuleViolationException e){

                if(e instanceof IllegalCharacterException)
                    System.out.println(e.getMessage());
                if(e instanceof StringTooLongException)
                    System.out.println(e.getMessage());

                System.out.println(e.getMessage());
                // throw new RuntimeException();
                // return 1;
            }
            finally {
                System.out.println("Insert next character");
                // throw new ArithmeticException();
                // return 2;
            }
        }

        Hangman hangman = new Hangman("qwertyuiopasdfghjklzxcvbnm");
        win = false;
        while(!win){
            Scanner sc = new Scanner(System.in);

            try {
                win = hangman.move(sc.nextLine());
            }catch (IllegalCharacterException e){
                System.out.println(e.getMessage());
            }
            catch (StringTooLongException e){

            }
            finally {
                System.out.println("Insert next character");
                // throw new ArithmeticException();
                // return 2;
            }
        }

    }
}
