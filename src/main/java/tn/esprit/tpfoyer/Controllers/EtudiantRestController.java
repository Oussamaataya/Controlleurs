package tn.esprit.tpfoyer.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entities.Etudiant;
import tn.esprit.tpfoyer.services.IEtudiantService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/etudiant")
public class EtudiantRestController {
    IEtudiantService etudiantService;

    @GetMapping("retrieve-all-etudiants")
    public List<Etudiant> getEtudiants() {
        List<Etudiant> listEtudiants =etudiantService.retrieAllEtudiants();
        return listEtudiants;
    }

    @PostMapping("add-etudiant")
    public Etudiant addCEtudiant(@RequestBody Etudiant etudiant) {
        return etudiantService.addCEtudiant(etudiant );
    }

    @PutMapping("/update-etudiant")
    public Etudiant updateEtudiant( Etudiant e) {
        Etudiant etudiant= etudiantService.updateEtudiant(e);
        return etudiant;
    }

    @DeleteMapping("/delete-etudiant/{id}")
    public void deleteEtudiant(@PathVariable Long id) {
        etudiantService.removeEtudiant(id);
    }

}
