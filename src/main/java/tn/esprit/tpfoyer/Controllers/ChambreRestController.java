package tn.esprit.tpfoyer.Controllers;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entities.Chambre;
import tn.esprit.tpfoyer.entities.TypeChambre;
import tn.esprit.tpfoyer.services.ChambreServiceImpl;
import tn.esprit.tpfoyer.services.IChambreService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/chambres")

public class ChambreRestController {
    IChambreService chambreService;


    @GetMapping("/typeChambre/{typeChambre}/bloc/{nomBloc}")
    public List<Chambre> getChambresByTypeChambreAndBloc(
            @PathVariable TypeChambre typeChambre,
            @PathVariable String nomBloc) {
        return chambreService.findByTypeChambreAndBlocNomBloc(typeChambre, nomBloc);
    }

    @GetMapping("/reservations/valides")
    public List<Chambre> getChambresByReservationsValides(@RequestParam boolean estValide) {
        return chambreService.findByReservationsEstValide(estValide);
    }

    @GetMapping("/bloc/{nomBloc}/capacite/{capaciteBloc}")
    public List<Chambre> getChambresByBlocAndCapacite(@PathVariable String nomBloc, @PathVariable long capaciteBloc) {
        return chambreService.findByBlocNomBlocAndBlocCapaciteBlocGreaterThan(nomBloc, capaciteBloc);
    }






}
