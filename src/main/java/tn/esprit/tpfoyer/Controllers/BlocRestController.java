package tn.esprit.tpfoyer.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.tpfoyer.entities.Bloc;
import tn.esprit.tpfoyer.services.IBlocService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/blocs")


public class BlocRestController {
    IBlocService blocService;
    @GetMapping("/universite/{nomUniversite}")
    public List<Bloc> getBlocsByUniversiteName(@PathVariable String nomUniversite) {
        return blocService.findByFoyerUniversiteNomUniversite(nomUniversite);
    }

}
