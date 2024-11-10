package tn.esprit.tpfoyer.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.tpfoyer.services.IFoyerService;

@RestController
@AllArgsConstructor
public class FoyerRestController {
    IFoyerService  foyerService;
}
