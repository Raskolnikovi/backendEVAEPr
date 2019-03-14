package fr.univbrest.dosi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import fr.univbrest.dosi.bean.Candidat;
import fr.univbrest.dosi.bean.Formation;
import fr.univbrest.dosi.bean.Question;
import fr.univbrest.dosi.business.CandidatBusiness;
import fr.univbrest.dosi.business.QuestionBusiness;


@RestController
//@CrossOrigin(origins = "http://localhost:5500", maxAge = 3600)
@RequestMapping("/question")
public class QuestionController {
	private QuestionBusiness Questionbusiness;
	
	@Autowired
	public QuestionController(QuestionBusiness business) {
		this.Questionbusiness = business;
	}
	

	@RequestMapping(method = RequestMethod.POST)
	public String ajouterQuestion(@RequestBody Question Question){
		return Questionbusiness.ajouterQuestion(Question);
	}
	@RequestMapping(method = RequestMethod.PUT)
	public String miseAjourdeQuestion(@RequestBody Question QuestionAMaj) {
		return Questionbusiness.modifierQuestion(QuestionAMaj);
	}
	@RequestMapping(method = RequestMethod.GET)
	public List<Question> recupererToutesLesQuestions() {
		return Questionbusiness.rechercherQuestions();
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value="/Supp/{idQuestion}")
	public String supprimerFormation(@PathVariable Integer idQuestion) {
		return Questionbusiness.supprimerQuestion(idQuestion);
	}
	


}
