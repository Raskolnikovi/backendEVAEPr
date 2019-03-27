package fr.univbrest.dosi.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import fr.univbrest.dosi.bean.QuestionEvaluation;
import fr.univbrest.dosi.bean.Rubrique;
import fr.univbrest.dosi.bean.RubriqueEvaluation;
import fr.univbrest.dosi.business.RubriqueOnly;

public interface QuestionEvaluationRepository extends CrudRepository<QuestionEvaluation, Integer> {
	List<QuestionOnly> findByRubriqueEvaluationIdRubriqueEvaluation(int idrubeval);

}
