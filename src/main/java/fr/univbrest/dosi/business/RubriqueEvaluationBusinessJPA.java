package fr.univbrest.dosi.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.univbrest.dosi.bean.Formation;
import fr.univbrest.dosi.bean.Rubrique;
import fr.univbrest.dosi.bean.RubriqueEvaluation;
import fr.univbrest.dosi.repositories.RubriqueEvaluationRepository;

@Component
public class RubriqueEvaluationBusinessJPA implements RubriqueEvaluationBusiness {
	
	private RubriqueEvaluationRepository repos ;
	
	@Autowired
	public RubriqueEvaluationBusinessJPA(RubriqueEvaluationRepository repos) {
		this.repos = repos;
	}
	
	@Override
	public List<RubriqueEvaluation> recupererToutesLesRubriques() {
		return (List<RubriqueEvaluation>) repos.findAll();
	}

	@Override
	public List<RubriqueOnly> recupererRubriqueEval(int eval) {
		return (List<RubriqueOnly>) repos.findByEvaluationIdEvaluation(eval);
	}

}
