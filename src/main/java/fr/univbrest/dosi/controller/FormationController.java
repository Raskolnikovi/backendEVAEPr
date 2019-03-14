package fr.univbrest.dosi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.univbrest.dosi.bean.Formation;
import fr.univbrest.dosi.business.FormationBussiness;



@RestController 
@RequestMapping("/formations")

public class FormationController {

	
	private FormationBussiness business;

	@Autowired
	public FormationController(FormationBussiness business) {
		this.business = business;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Formation creerFormation(@RequestBody Formation formationACreer) {
		return business.creerFormation(formationACreer);
	}
	@RequestMapping(method = RequestMethod.PUT)
	public Formation miseAjourdeFormation(@RequestBody Formation formationAMaj) {
		return business.updateFormation(formationAMaj);
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Formation> recupererToutesLesFormations() {
		return business.recupererToutesLesFormations();
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/nom/{nom}")
	public List<Formation> recupererLaFormationAvecLeNom(@PathVariable String nom) {
		return business.rechercherFormationParNom(nom);
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/{id}")
	public Formation recupererLaFormationAvecLeCodeFormation(@PathVariable String id) {
		return business.rechercherFormationParId(id);
	}
	@RequestMapping(method = RequestMethod.DELETE, value="/Supp/{id}")
	public void supprimerFormation(@PathVariable String id) {
		business.supprimerFormationByID(id);
	}
	
}
