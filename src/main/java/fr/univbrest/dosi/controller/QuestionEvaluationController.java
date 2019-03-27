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
	


}
