package tn.esprit.tpfoyer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tpfoyer.entities.Tache;

public interface TacheRepository extends JpaRepository<Tache, Long> {
}
