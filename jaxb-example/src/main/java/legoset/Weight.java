package legoset;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

public class Weight {
    @XmlAttribute
    private String unit;

    @XmlValue
    private double value;

    public Weight(double value, String unit) {
        this.value = value;
        this.unit = unit;
    }

}