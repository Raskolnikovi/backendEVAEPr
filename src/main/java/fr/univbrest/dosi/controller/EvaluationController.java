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
	public void creerEvaluation(@RequestBody Evaluation evaluationACreer) throws Exception {
		 evaluationBusiness.creerEvaluation(evaluationACreer); 
		
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Evaluation> recupererTousLesEvaluations() {
		return evaluationBusiness.recupererTousLesEvaluations();
	}
	
	@RequestMapping(value="/{noEnseignant}" ,method = RequestMethod.GET)
	public List<Evaluation> recupererEvalParEnseignant(@PathVariable("noEnseignant") int noEnseignant) {
		return evaluationBusiness.recupererEvaluationsParEnseignant(noEnseignant);
	}
	
	@RequestMapping(value="/{idEvaluation}" ,method = RequestMethod.GET)
	public Evaluation recupererEvalParId(@PathVariable("idEvaluation") int idEvaluation) {
		return evaluationBusiness.recupererEvaluationParId(idEvaluation);
	}

}
