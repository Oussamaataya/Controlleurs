package tn.esprit.tpfoyer.services;

import tn.esprit.tpfoyer.entities.Foyer;
import tn.esprit.tpfoyer.repositories.FoyerRepository;

import java.util.List;

public class FoyerServiceImpl implements  IFoyerService{

    FoyerRepository foyerRepository;


    @Override
    public List<Foyer> retrieAllFoyers() {
        return foyerRepository.findAll();
    }

    @Override
    public Foyer addFoyer(Foyer f) {
       return foyerRepository.save(f);
    }

    @Override
    public Foyer updateFoyer(Foyer f) {
        return foyerRepository.save(f);
    }

    @Override
    public Foyer retrieFoyer(Long idFoyer) {
        return foyerRepository.findById(idFoyer).get();
    }

    @Override
    public void removeFoyer(Long idFoyer) {
       foyerRepository.deleteById(idFoyer);
    }
}
