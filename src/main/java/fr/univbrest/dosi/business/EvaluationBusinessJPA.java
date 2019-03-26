package fr.univbrest.dosi.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.univbrest.dosi.bean.Evaluation;
import fr.univbrest.dosi.bean.Message;
import fr.univbrest.dosi.bean.Qualificatif;
import fr.univbrest.dosi.repositories.EvaluationRepository;
@Component
public class EvaluationBusinessJPA implements EvaluationBusiness {
	
private EvaluationRepository repos ;
	
	@Autowired
	public EvaluationBusinessJPA(EvaluationRepository repos) {

		this.repos = repos;
	}

	@Override
	public Message creerEvaluation(Evaluation evaluationACreer) {
		try {
			repos.save(evaluationACreer);
			return new Message("Evaluation Ajoutée");	 
		}catch(Exception e) {
			return new Message("Erreur : Ajout impossible ");	 
		}
	}

	@Override
	public List<Evaluation> recupererTousLesEvaluations() {
		return (List<Evaluation>) repos.findAll();
	}

}
