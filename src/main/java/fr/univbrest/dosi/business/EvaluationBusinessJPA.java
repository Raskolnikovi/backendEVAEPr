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
	public void creerEvaluation(Evaluation evaluationACreer) throws Exception {
		
			repos.save(evaluationACreer);
	
	}

	@Override
	public List<Evaluation> recupererTousLesEvaluations() {
		return (List<Evaluation>) repos.findAll();
	}
	
	@Override
	public List<Evaluation> recupererEvaluationsParEnseignant(int noEnseignant) {
		return (List<Evaluation>) repos.findByEnseignantNoEnseignant(noEnseignant);
	}

	@Override
	public Evaluation recupererEvaluationParId(int id) {
		return repos.findById(id).orElse(null);
	}

}
