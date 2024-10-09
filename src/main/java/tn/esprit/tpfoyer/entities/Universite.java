package tn.esprit.tpfoyer.entities;


import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table( name = "Universite")
public class Universite implements Serializable {


    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idUniversite ;
    private String nomUniversite;
    private String adresse;

    @OneToOne(mappedBy="universite")
    private Foyer foyer;


    public Universite(long idUniversite, String nomUniversite, String adresse) {
        this.idUniversite = idUniversite;
        this.nomUniversite = nomUniversite;
        this.adresse = adresse;
    }

    public Universite() {

    }

    public long getIdUniversite() {
        return idUniversite;
    }

    public void setIdUniversite(long idUniversite) {
        this.idUniversite = idUniversite;
    }

    public String getNomUniversite() {
        return nomUniversite;
    }

    public void setNomUniversite(String nomUniversite) {
        this.nomUniversite = nomUniversite;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }


    @Override
    public String toString() {
        return "Universite{" +
                "idUniversite=" + idUniversite +
                ", nomUniversite='" + nomUniversite + '\'' +
                ", adresse='" + adresse + '\'' +
                '}';
    }
}
