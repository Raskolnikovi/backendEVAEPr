package fr.univbrest.dosi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.univbrest.dosi.bean.Promotion;
import fr.univbrest.dosi.bean.PromotionPK;
import fr.univbrest.dosi.business.PromotionBussiness;



@RestController 
//@CrossOrigin(origins = "http://localhost:3333", maxAge = 3600)
@RequestMapping("/Promotion")
public class PromotionController {

	private PromotionBussiness business;

	@Autowired
	public PromotionController(PromotionBussiness business) {
		
		this.business = business;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Promotion creerPromotion(@RequestBody Promotion promotiontACreer) {
		return business.creerPromotion(promotiontACreer); 
		
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Promotion> recupererTousLesPromotions() {
		return business.recupererTousLesPromotions();
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/For/{codeFormation}")
	public List<Promotion> recupererPromotionParFormation(@PathVariable String codeFormation) {
		return business.rechercheParFormation(codeFormation);
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/id/{anneUniv}/{codeForm}")
	public Promotion recupererPromotionParId(@PathVariable String anneUniv , @PathVariable String codeForm) {
		return business.rechercherPromotionParId(new PromotionPK(anneUniv,codeForm));
	}

	@RequestMapping(method = RequestMethod.DELETE, value="/{codeForm}/{anneUniv}")
	public String suppCandidat(@PathVariable String codeForm , @PathVariable String anneUniv) {
		//Promotion p = recupererPromotionAvecLId(new PromotionPK(anneUniv,codeForm));
		 business.supprimerPromotionByID(new PromotionPK(anneUniv,codeForm));
		return "Spprimer !!";
	}

}
