package tn.esprit.tpfoyer.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entities.Etudiant;
import tn.esprit.tpfoyer.entities.Tache;
import tn.esprit.tpfoyer.services.ITacheService;

import java.util.List;

@RestController
@AllArgsConstructor
public class TacheRestController {
    ITacheService tacheService;

    @GetMapping("retrieve-all-taches")
    public List<Tache> getTaches() {
        List<Tache> listTaches =tacheService.retrieAllTaches();
        return listTaches;
    }

    @PostMapping("add-tache")
    public Tache addTache(@RequestBody Tache tache) {
        return tacheService.addTache(tache);
    }

    @PutMapping("/update-tache")
    public Tache updateTache( Tache e) {
        Tache tache= tacheService.updateTache(e);
        return tache;
    }

    @DeleteMapping("/delete-tache/{id}")
    public void deleteTache(@PathVariable Long id) {
        tacheService.removeTache(id);
    }
}
