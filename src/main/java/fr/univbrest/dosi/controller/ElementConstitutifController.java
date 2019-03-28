package fr.univbrest.dosi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.univbrest.dosi.bean.ElementConstitutif;
import fr.univbrest.dosi.bean.UniteEnseignement;
import fr.univbrest.dosi.business.CandidatBusiness;
import fr.univbrest.dosi.business.ElementConstitutifBusiness;

@RestController
//@CrossOrigin(origins = "http://localhost:5500", maxAge = 3600)
@RequestMapping("/ec")
public class ElementConstitutifController {
	private ElementConstitutifBusiness elementConstitutifBusiness;
	
	@Autowired
	public ElementConstitutifController(ElementConstitutifBusiness business) {
		this.elementConstitutifBusiness = business;
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/{codeFormation}/{codeUe}")
	public List<ElementConstitutif> recupererUeParFormation(@PathVariable String codeFormation, @PathVariable String codeUe) {
		return elementConstitutifBusiness.rechercherParUniteEnseignement(codeUe, codeFormation);
		
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/{codeFormation}/{codeUe}/{noEnseignant}")
	public List<ElementConstitutif> recupererUeParFormationEns(@PathVariable String codeFormation, @PathVariable String codeUe, @PathVariable int noEnseignant) {
		return elementConstitutifBusiness.rechercherParUniteEnseignementEnseignant(codeUe, codeFormation, noEnseignant);
		
	}
	

}
