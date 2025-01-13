public class WindInstrument extends Instrument{
    public WindInstrument(String name, int price){
        super(name,price);
    }

    @Override
    public void tocar() {
        System.out.println("Està sonant un instrument de vent");
    }
}
