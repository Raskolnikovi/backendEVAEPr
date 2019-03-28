package fr.univbrest.dosi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.univbrest.dosi.bean.Message;
import fr.univbrest.dosi.bean.QuestionEvaluation;
import fr.univbrest.dosi.bean.Rubrique;
import fr.univbrest.dosi.bean.RubriqueEvaluation;
import fr.univbrest.dosi.business.QuestionEvaluationBusiness;
import fr.univbrest.dosi.business.RubriqueBusiness;
import fr.univbrest.dosi.business.RubriqueEvaluationBusiness;
import fr.univbrest.dosi.business.RubriqueOnly;
import fr.univbrest.dosi.repositories.QuestionOnly;

@RestController
//@CrossOrigin(origins = "http://localhost:5500", maxAge = 3600)
@RequestMapping("/qstrub")
public class QuestionEvaluationController {
	private QuestionEvaluationBusiness evalBusiness;
	
	@Autowired
	public QuestionEvaluationController(QuestionEvaluationBusiness business) {
		this.evalBusiness = business;
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/{idRubEval}")
	public List<QuestionOnly> recupererQuestionsRubriqueEval(@PathVariable int idRubEval) {
		return evalBusiness.recupererQuestionRubEval(idRubEval);
	}
	
	
	@RequestMapping(method = RequestMethod.POST)
	public void creerQstEval(@RequestBody QuestionEvaluation QstEvalAcreer) {
		evalBusiness.creerQstEval(QstEvalAcreer); 
		
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public void modifierQstEval(@RequestBody QuestionEvaluation QstEvalAmodifier) {
		evalBusiness.modifierQstEval(QstEvalAmodifier); 
		
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value="/Supp/{idQstEval}")
	public Message supprimerQstEval(@PathVariable int idQstEval) {
		return evalBusiness.supprimerQstEval(idQstEval);
	}
	


}
