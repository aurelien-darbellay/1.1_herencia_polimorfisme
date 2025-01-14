package phones;

public class Smartphone extends Telefon implements Camera, Rellotge {
    public Smartphone(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void fotografiar() {
        System.out.println("S'està fent una foto");
    }

    @Override
    public void alarma() {
        System.out.println("Està sonant l'alarma");
    }
}
