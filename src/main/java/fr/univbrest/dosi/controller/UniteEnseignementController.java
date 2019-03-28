package fr.univbrest.dosi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import fr.univbrest.dosi.bean.Etudiant;
import fr.univbrest.dosi.bean.Promotion;
import fr.univbrest.dosi.bean.UniteEnseignement;
import fr.univbrest.dosi.business.EtudiantBusiness;
import fr.univbrest.dosi.business.UniteEnseignementBusiness;


@RestController
//@CrossOrigin(origins = "http://localhost:5500", maxAge = 3600)
@RequestMapping("/ue")
public class UniteEnseignementController {
	
	private UniteEnseignementBusiness uniteEnseignementBusiness;
	
	@Autowired
	public UniteEnseignementController(UniteEnseignementBusiness business) {
		this.uniteEnseignementBusiness = business;
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/ens/{noEnseignant}")
	public List<UniteEnseignement> recupererUEParEnseignant(@PathVariable int noEnseignant) {
		return uniteEnseignementBusiness.rechercherParEnseignant(noEnseignant);
	}
	

	@RequestMapping(method=RequestMethod.GET, value="/{codeFormation}")
	public List<UniteEnseignement> recupererUeParFormation(@PathVariable String codeFormation) {
		return uniteEnseignementBusiness.rechercherParFormation(codeFormation);
		
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/ensfor/{noEnseignant}/{codeFormation}")
	public List<UniteEnseignement> recupererUeParEnsFormation(@PathVariable int noEnseignant,@PathVariable String codeFormation) {
		return uniteEnseignementBusiness.rechercherParFormationAndEnseignant(codeFormation,noEnseignant);
		
	}
	

}
