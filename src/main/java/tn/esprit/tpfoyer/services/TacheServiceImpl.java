package tn.esprit.tpfoyer.services;

import tn.esprit.tpfoyer.entities.Foyer;
import tn.esprit.tpfoyer.entities.Tache;
import tn.esprit.tpfoyer.repositories.TacheRepository;

import java.util.List;

public class TacheServiceImpl implements  ITacheService{

    TacheRepository tacheRepository;
    @Override
    public List<Tache> retrieAllTaches() {
        return tacheRepository.findAll();
    }

    @Override
    public Tache addTache(Tache f) {
        return tacheRepository.save(f);
    }

    @Override
    public Tache updateTache(Tache f) {
        return tacheRepository.save(f);
    }

    @Override
    public Tache retrieTache(Long idTache) {
        return tacheRepository.findById(idTache).get();
    }

    @Override
    public void removeTache(Long idTache) {
        tacheRepository.deleteById(idTache);

    }
}
