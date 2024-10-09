package tn.esprit.tpfoyer.entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;


@Entity
@Table( name = "Etudiant")
public class Etudiant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEtudiant;
    private String nomEt;
    private String prenomEt;
    private Long cin;
    private String ecole;
    private Date dateNaissance;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="etudiant")
    private Set<Tache> taches;


    @ManyToMany(mappedBy="etudiants", cascade = CascadeType.ALL)
    private Set<Reservation> reservations;


    @OneToOne(mappedBy="etudiantt")
    private Tache tache;


    @Enumerated(EnumType.STRING)
    private TypeEtudiant typeEtudiant;

    public TypeEtudiant getTypeEtudiant() {
        return typeEtudiant;
    }

    public void setTypeEtudiant(TypeEtudiant typeEtudiant) {
        this.typeEtudiant = typeEtudiant;
    }


    public Etudiant(Long idEtudiant, String nomEt, String prenomEt, Long cin, String ecole, Date dateNaissance, Set<Tache> taches, Set<Reservation> reservations, TypeEtudiant typeEtudiant) {
        this.idEtudiant = idEtudiant;
        this.nomEt = nomEt;
        this.prenomEt = prenomEt;
        this.cin = cin;
        this.ecole = ecole;
        this.dateNaissance = dateNaissance;
        this.taches = taches;
        this.reservations = reservations;
        this.typeEtudiant = typeEtudiant;
    }

    public Etudiant() {

    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "idEtudiant=" + idEtudiant +
                ", nomEt='" + nomEt + '\'' +
                ", prenomEt='" + prenomEt + '\'' +
                ", cin=" + cin +
                ", ecole='" + ecole + '\'' +
                ", dateNaissance=" + dateNaissance +
                ", taches=" + taches +
                ", reservations=" + reservations +
                ", typeEtudiant=" + typeEtudiant +
                '}';
    }

    public Long getIdEtudiant() {
        return idEtudiant;
    }

    public void setIdEtudiant(Long idEtudiant) {
        this.idEtudiant = idEtudiant;
    }

    public String getNomEt() {
        return nomEt;
    }

    public void setNomEt(String nomEt) {
        this.nomEt = nomEt;
    }

    public String getPrenomEt() {
        return prenomEt;
    }

    public void setPrenomEt(String prenomEt) {
        this.prenomEt = prenomEt;
    }

    public Long getCin() {
        return cin;
    }

    public void setCin(Long cin) {
        this.cin = cin;
    }

    public String getEcole() {
        return ecole;
    }

    public void setEcole(String ecole) {
        this.ecole = ecole;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }
}
