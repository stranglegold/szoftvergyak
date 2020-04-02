package legoset;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

public class Minifig {


    @XmlAttribute
    private int count;

    @XmlValue
    private String figure;

    public Minifig(int count, String figure) {
        this.count = count;
        this.figure = figure;
    }

}
