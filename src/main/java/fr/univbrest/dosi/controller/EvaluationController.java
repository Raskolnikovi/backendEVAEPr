package fr.univbrest.dosi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.univbrest.dosi.bean.Etudiant;
import fr.univbrest.dosi.bean.Evaluation;
import fr.univbrest.dosi.bean.Message;
import fr.univbrest.dosi.bean.Promotion;
import fr.univbrest.dosi.bean.PromotionPK;
import fr.univbrest.dosi.business.EtudiantBusiness;
import fr.univbrest.dosi.business.EvaluationBusiness;

@RestController
@RequestMapping("/evaluation")
public class EvaluationController {
	
	private EvaluationBusiness evaluationBusiness;
	
	@Autowired
	public EvaluationController(EvaluationBusiness business) {
		this.evaluationBusiness = business;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Message creerEvaluation(@RequestBody Evaluation evaluationACreer) {
		return evaluationBusiness.creerEvaluation(evaluationACreer); 
		
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Evaluation> recupererTousLesPromotions() {
		return evaluationBusiness.recupererTousLesEvaluations();
	}
	

}
