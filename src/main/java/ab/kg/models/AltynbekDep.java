package ab.kg.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Altynbek on 28.12.2020.
 */
@Entity
public class AltynbekDep {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String u_name;
    private String altuha_pole;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getU_name() {
        return u_name;
    }

    public void setU_name(String u_name) {
        this.u_name = u_name;
    }

    public String getAltuha_pole() {
        return altuha_pole;
    }

    public void setAltuha_pole(String altuha_pole) {
        this.altuha_pole = altuha_pole;
    }
}
