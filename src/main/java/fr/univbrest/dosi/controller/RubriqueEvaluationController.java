package fr.univbrest.dosi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.univbrest.dosi.bean.Evaluation;
import fr.univbrest.dosi.bean.Message;
import fr.univbrest.dosi.bean.Rubrique;
import fr.univbrest.dosi.bean.RubriqueEvaluation;
import fr.univbrest.dosi.business.RubriqueBusiness;
import fr.univbrest.dosi.business.RubriqueEvaluationBusiness;
import fr.univbrest.dosi.business.RubriqueOnly;

@RestController
//@CrossOrigin(origins = "http://localhost:5500", maxAge = 3600)
@RequestMapping("/rubriqueeval")
public class RubriqueEvaluationController {
	private RubriqueEvaluationBusiness rubriqueBusiness;
	
	@Autowired
	public RubriqueEvaluationController(RubriqueEvaluationBusiness business) {
		this.rubriqueBusiness = business;
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/{idEvaluation}")
	public List<RubriqueOnly> recupererRubriqueEval(@PathVariable int idEvaluation) {
		return rubriqueBusiness.recupererRubriqueEval(idEvaluation);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public void creerRubEval(@RequestBody RubriqueEvaluation rubEvalAcreer) {
		rubriqueBusiness.creerRubEval(rubEvalAcreer); 
		
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public void modifierRubEval(@RequestBody RubriqueEvaluation rubEvalAmodifier) {
		rubriqueBusiness.modifierRubEval(rubEvalAmodifier); 
		
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value="/Supp/{idRubEval}")
	public Message supprimerRubEval(@PathVariable int idRubEval) {
		return rubriqueBusiness.supprimerRubEval(idRubEval);
	}
	


}
