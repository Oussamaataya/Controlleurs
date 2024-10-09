package tn.esprit.tpfoyer.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Table( name = "Bloc")
public class Bloc implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idBloc ;
    private String nomBloc;
    private int CapaciteBloc;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="bloc")
    private Set<Chambre> chambres;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="blocc")
    private Set<Foyer> foyers;



    public Bloc(long idBloc, String nomBloc, int capaciteBloc) {
        this.idBloc = idBloc;
        this.nomBloc = nomBloc;
        CapaciteBloc = capaciteBloc;
    }

    public Bloc() {
      ;
    }

    public long getIdBloc() {
        return idBloc;
    }

    public void setIdBloc(long idBloc) {
        this.idBloc = idBloc;
    }

    public String getNomBloc() {
        return nomBloc;
    }

    public void setNomBloc(String nomBloc) {
        this.nomBloc = nomBloc;
    }

    public int getCapaciteBloc() {
        return CapaciteBloc;
    }

    public void setCapaciteBloc(int capaciteBloc) {
        CapaciteBloc = capaciteBloc;
    }

    @Override
    public String toString() {
        return "Bloc{" +
                "idBloc=" + idBloc +
                ", nomBloc='" + nomBloc + '\'' +
                ", CapaciteBloc=" + CapaciteBloc +
                '}';
    }
}

