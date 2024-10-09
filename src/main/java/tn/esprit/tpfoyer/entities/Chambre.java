package tn.esprit.tpfoyer.entities;


import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;

@Entity
public class Chambre  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idFoyer ;
    private long numChambre;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Reservation> reservations;

    @ManyToOne
    Bloc bloc;

    @Enumerated(EnumType.STRING)
    private TypeChambre typeChambre;

    public Chambre(long idFoyer, long numChambre, TypeChambre typeChambre) {
        this.idFoyer = idFoyer;
        this.numChambre = numChambre;
        this.typeChambre = typeChambre;
    }

    public Chambre() {

    }

    public long getIdFoyer() {
        return idFoyer;
    }

    public void setIdFoyer(long idFoyer) {
        this.idFoyer = idFoyer;
    }

    public long getNumChambre() {
        return numChambre;
    }

    public void setNumChambre(long numChambre) {
        this.numChambre = numChambre;
    }

    public TypeChambre getTypeChambre() {
        return typeChambre;
    }

    public void setTypeChambre(TypeChambre typeChambre) {
        this.typeChambre = typeChambre;
    }

    @Override
    public String toString() {
        return "Chambre{" +
                "idFoyer=" + idFoyer +
                ", numChambre=" + numChambre +
                ", TypeChambre=" + typeChambre +
                '}';
    }
}
