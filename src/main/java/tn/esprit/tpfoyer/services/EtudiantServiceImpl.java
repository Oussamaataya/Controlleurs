package tn.esprit.tpfoyer.services;

import tn.esprit.tpfoyer.entities.Etudiant;
import tn.esprit.tpfoyer.repositories.EtudiantRepository;


import java.util.List;

public class EtudiantServiceImpl implements  IEtudiantService {
EtudiantRepository etudiantRepository;
    @Override
    public List<Etudiant> retrieAllEtudiants() {
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant addCEtudiant(Etudiant e) {
        return etudiantRepository.save(e);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant e) {
        return etudiantRepository.save(e);
    }

    @Override
    public Etudiant retrieEtudiant(Long idEtudiant) {
        return etudiantRepository.findById(idEtudiant).get();
    }

    @Override
    public void removeEtudiant(Long idEtudiant) {
        etudiantRepository.deleteById(idEtudiant);
    }
}
