package tn.esprit.tpfoyer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import tn.esprit.tpfoyer.entities.Chambre;

public interface ChambreRepository extends JpaRepository<Chambre, Long> {
}
