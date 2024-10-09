package tn.esprit.tpfoyer.services;

import tn.esprit.tpfoyer.entities.Bloc;
import tn.esprit.tpfoyer.repositories.BlocRepository;

import java.util.List;

public class BlocServiceImpl implements  IBlocService {
    BlocRepository blocRepository;
    @Override
    public List<Bloc> retrieAllBlocs() {
        return blocRepository.findAll();
    }

    @Override
    public Bloc addBloc(Bloc b) {
        return blocRepository.save(b);
    }

    @Override
    public Bloc updateBloc(Bloc b) {
        return blocRepository.save(b);
    }

    @Override
    public Bloc retrieBloc(Long idBloc) {
        return blocRepository.findById(idBloc).get();
    }

    @Override
    public void removeBloc(Long idBloc) {
        blocRepository.deleteById(idBloc);

    }
}
