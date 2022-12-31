package it.unive.PO1.tutorato.subtyping;

public class Human extends Humaniod {

    public Human(String name, int power) {
        super(name, power);
    }

    public String speak(){
        return "Ciao";
    }

    @Override
    void attack() {
        System.out.println(this.name + "(Human) attacks with " + this.power + " power");
    }
}
