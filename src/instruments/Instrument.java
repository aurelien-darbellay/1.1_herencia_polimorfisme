package instruments;

public abstract class Instrument {
    private String name;
    private int price;

    static {
        System.out.println("Instrument workshop established");
    };

    {
        System.out.println("Creating a new instrument");
    }

    public Instrument(String name, int price){
        this.name = name;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
    public abstract void tocar();
    public static void plorar(){
        System.out.println("No hi ha cap instrument, i això és molt trist.");
    }

}
