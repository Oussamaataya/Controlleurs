package tn.esprit.tpfoyer.services;

import tn.esprit.tpfoyer.entities.Bloc;
import tn.esprit.tpfoyer.entities.Chambre;

import java.util.List;

public interface IChambreService {
    List<Chambre> retrieAllChambres();
    Chambre addChambre(Chambre c);
    Chambre updateChambre(Chambre c);
    Chambre retrieChambre(Long idChambre);
    void removeChambre(Long idChambre);
}
