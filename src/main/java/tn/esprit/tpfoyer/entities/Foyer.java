package tn.esprit.tpfoyer.entities;


import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;

@Entity
@Table( name = "Foyer")
public class Foyer implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idFoyer ;
    private String nomFoyer;
    private int CapaciteFoyer;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="foyer")
    private Set<Bloc> blocs;

    @OneToOne
    private Universite universite;



    public Foyer() {

    }

    public Foyer(long idFoyer, String nomFoyer, int capaciteFoyer) {
        this.idFoyer = idFoyer;
        this.nomFoyer = nomFoyer;
        CapaciteFoyer = capaciteFoyer;
    }

    public long getIdFoyer() {
        return idFoyer;
    }

    public void setIdFoyer(long idFoyer) {
        this.idFoyer = idFoyer;
    }

    public String getNomFoyer() {
        return nomFoyer;
    }

    public void setNomFoyer(String nomFoyer) {
        this.nomFoyer = nomFoyer;
    }

    public int getCapaciteFoyer() {
        return CapaciteFoyer;
    }

    public void setCapaciteFoyer(int capaciteFoyer) {
        CapaciteFoyer = capaciteFoyer;
    }

    @Override
    public String toString() {
        return "Foyer{" +
                "idFoyer=" + idFoyer +
                ", nomFoyer='" + nomFoyer + '\'' +
                ", CapaciteFoyer=" + CapaciteFoyer +
                '}';
    }
}
