package legoset;

import jaxb.JAXBHelper;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws Exception {
        LegoSet legoSet = new LegoSet();
        legoSet.setName("Imperial TIE Fighter");
        legoSet.setNumber("75211");
        legoSet.setTheme("Star Wars");
        legoSet.setSubtheme("Solo");
        legoSet.setYear(Year.of(2018));
        legoSet.setPieces(519);
        legoSet.setTags(Set.of("Starfighter", "Stormtrooper", "Star Wars", "Solo"));
        ArrayList<Minifig> minifigs = new ArrayList<>();
        minifigs.add(new Minifig(2, "Mudtrooper"));
        minifigs.add(new Minifig(1, "Imperial Pilot"));
        minifigs.add(new Minifig(1, "Mimban Stormtrooper"));
        legoSet.setMinifigs(minifigs);
        legoSet.setWeight(new Weight(0.89, "kg"));
        legoSet.setUrl("https://brickset.com/sets/75211-1/Imperial-TIE-Fighter");


        JAXBHelper.toXML(legoSet, System.out);

    }
} 
