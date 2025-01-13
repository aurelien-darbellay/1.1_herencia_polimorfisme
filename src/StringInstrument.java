public class StringInstrument extends Instrument{
    public StringInstrument(String name, int price){
        super(name,price);
    }
    @Override
    public void tocar() {
        System.out.println("Està sonant un instrument de corda");
    }
}
