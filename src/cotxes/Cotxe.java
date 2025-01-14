package cotxes;

public class Cotxe {
    public static final String brand = "Opel";
    public static String model = "Clia";
    public final int potencia;

    public Cotxe(int potencia) {
        this.potencia = potencia;
    }

    public static void setModel(String model) {
        Cotxe.model = model;
    }

    public static String getBrand() {
        return brand;
    }

    public static String getModel() {
        return model;
    }
    public int getPotencia() {
        return potencia;
    }
    public static void frenar(){
        System.out.println("El vehicle està frenant");
    }
    public void accelerar(){
        System.out.println("El vehicle està accelerant");
    }
}
