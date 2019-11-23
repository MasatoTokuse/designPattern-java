package flyweight;

import java.util.List;
import java.util.ArrayList;

public class FlyWeightSample {
    public static void main(String[] args) {
        StampFactory factory = new StampFactory();
        List<Stamp> stamps = new ArrayList<Stamp>();
        stamps.add(factory.get('た'));
        stamps.add(factory.get('か'));
        stamps.add(factory.get('い'));
        stamps.add(factory.get('た'));
        stamps.add(factory.get('け'));
        stamps.add(factory.get('た'));
        stamps.add(factory.get('て'));
        stamps.add(factory.get('か'));
        stamps.add(factory.get('け'));
        stamps.add(factory.get('た'));
        for(Stamp s : stamps){
            s.print();
        }
    }
}
