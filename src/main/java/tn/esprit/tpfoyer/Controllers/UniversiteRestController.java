package tn.esprit.tpfoyer.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.tpfoyer.services.IUniversiteService;

@RestController
@AllArgsConstructor
public class UniversiteRestController {
    IUniversiteService universiteService;
}
