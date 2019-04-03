package fr.univbrest.dosi.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import fr.univbrest.dosi.bean.Rubrique;
import fr.univbrest.dosi.bean.RubriqueEvaluation;
import fr.univbrest.dosi.business.RubriqueOnly;

public interface RubriqueEvaluationRepository extends CrudRepository<RubriqueEvaluation, Integer> {
	List<RubriqueOnly> findByEvaluationIdEvaluationOrderByOrdreAsc(int idevaluation);
	RubriqueEvaluation findFirstByEvaluationIdEvaluationOrderByOrdreDesc(int idevaluation);
	List<RubriqueOnly> findByEvaluationIdEvaluationAndOrdreGreaterThan(int idevaluation, int ordre);
	List<RubriqueOnly> findByEvaluationIdEvaluationAndOrdreLessThan(int idevaluation, int ordre);
}
