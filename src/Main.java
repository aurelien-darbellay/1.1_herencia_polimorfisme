import cotxes.Cotxe;
import instruments.PercussionInstrument;
import instruments.StringInstrument;
import instruments.WindInstrument;
import instruments.Instrument;

public class Main {
    public static void main(String[] args) {

        //Exercise 1
        Instrument.plorar();
        WindInstrument saxophone = new WindInstrument("saxophone", 1800);
        StringInstrument violin = new StringInstrument("violin",25000);
        PercussionInstrument drum = new PercussionInstrument("drum", 500);
        saxophone.tocar();
        drum.tocar();
        violin.tocar();
        System.out.println(saxophone.getName());
        System.out.println(violin.getPrice());
        System.out.println(drum.getName());

        //Exercise 2
        System.out.println(Cotxe.brand);
        System.out.println(Cotxe.model);
        Cotxe.setModel("Fatal");
        System.out.println(Cotxe.model);
        Cotxe myCotxe = new Cotxe(120);
        System.out.println(myCotxe.getPotencia());
        myCotxe.accelerar();
        Cotxe.frenar();
    }
}