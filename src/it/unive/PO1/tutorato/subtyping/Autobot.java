package it.unive.PO1.tutorato.subtyping;

// Implementa tutti i metodi di transformer (quindi anche del'interfaccia Transformable)
// dunque può essere istanziata
class Autobot extends Transformer {

    public Autobot() {
    }

    // La classe transformer non implementa
    @Override
    public void powerUp() {
        System.out.println("[]");
    }

    public static void main(String[] args) {
        Transformer a = new Autobot();
        a.greet();
        a.powerUp();
    }
}