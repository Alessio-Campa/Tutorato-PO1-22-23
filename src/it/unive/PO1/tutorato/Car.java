package it.unive.PO1.tutorato;

public class Car extends Veicle{
    private int numberOfWheels = 4;

    public static void main(String[] args) {
        Veicle v = new Car();
        Car c = new Car();
        System.out.println(c.numberOfWheels);
    }
}
