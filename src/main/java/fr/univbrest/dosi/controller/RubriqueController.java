package fr.univbrest.dosi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.univbrest.dosi.bean.Message;
import fr.univbrest.dosi.bean.Rubrique;
import fr.univbrest.dosi.business.RubriqueBusiness;
import fr.univbrest.dosi.business.RubriqueBusiness;

@RestController
//@CrossOrigin(origins = "http://localhost:5500", maxAge = 3600)
@RequestMapping("/rubrique")
public class RubriqueController {
	
	private RubriqueBusiness rubriqueBusiness;
	
	@Autowired
	public RubriqueController(RubriqueBusiness business) {
		this.rubriqueBusiness = business;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Message ajouterRubrique(@RequestBody Rubrique Rubrique){
		return rubriqueBusiness.ajouterRubrique(Rubrique);
	}
	@RequestMapping(method = RequestMethod.PUT)
	public Message miseAjourdeRubrique(@RequestBody Rubrique RubriqueAMaj) {
		return rubriqueBusiness.modifierRubrique(RubriqueAMaj);
	}
	@RequestMapping(method = RequestMethod.GET)
	public List<Rubrique> recupererToutesLesRubriques() {
		return rubriqueBusiness.rechercherRubriques();
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value="/Supp/{idRubrique}")
	public Message supprimerFormation(@PathVariable Integer idRubrique) {
		return rubriqueBusiness.supprimerRubrique(idRubrique);
	}
	

}
