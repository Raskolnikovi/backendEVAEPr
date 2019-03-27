package fr.univbrest.dosi.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.univbrest.dosi.repositories.QuestionEvaluationRepository;
import fr.univbrest.dosi.repositories.QuestionOnly;
import fr.univbrest.dosi.repositories.RubriqueEvaluationRepository;
@Component
public class QuestionEvaluationBusinessJPA implements QuestionEvaluationBusiness {
	
	private QuestionEvaluationRepository repos ;
	
	@Autowired
	public QuestionEvaluationBusinessJPA(QuestionEvaluationRepository repos) {
		this.repos = repos;
	}

	@Override
	public List<QuestionOnly> recupererQuestionRubEval(int rubeval) {
		return (List<QuestionOnly>) repos.findByRubriqueEvaluationIdRubriqueEvaluation(rubeval);
	}

}
