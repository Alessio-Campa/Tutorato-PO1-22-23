package it.unive.PO1.tutorato.inheritance.ingredienti;

public class Ingrediente {
    private final String name;
    private final int quantity;

    public Ingrediente(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }
}
