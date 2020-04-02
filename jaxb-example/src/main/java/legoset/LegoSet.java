package legoset;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import movie.YearAdapter;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.Year;
import java.util.List;
import java.util.Set;



@Getter
@Setter
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder =  {"name", "theme", "subtheme", "year", "pieces", "tags",
        "minifigs", "weight", "url" })
@Data
public class LegoSet {

    public String name;

    @XmlAttribute
    public String number;

    private String theme;
    private String subtheme;

    @XmlJavaTypeAdapter(YearAdapter.class)
    private Year year;

    private int pieces;

    @XmlElementWrapper(name = "tags")
    @XmlElement(name = "tag")
    private Set<String> tags;

    @XmlElementWrapper(name = "minifigs")
    @XmlElement(name = "minfig")
    private List<Minifig> minifigs;

    private Weight weight;
    private String url;


}
