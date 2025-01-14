package phones;

public class Telefon {
    private final String brand;
    private final String model;

    public Telefon(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void trucar(String missatge, int number) {
        System.out.println("Trucant al número " + number + " per transmettre el missatge següent: " + missatge);
    }

}
