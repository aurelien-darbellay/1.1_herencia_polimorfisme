public class PercussionInstrument extends Instrument{
    public PercussionInstrument(String name, int price){
        super(name,price);
    }
    @Override
    public void tocar() {
        System.out.println("Està sonant un instrument de percussió");
    }
}
