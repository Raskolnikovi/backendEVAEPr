package fr.univbrest.dosi.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import fr.univbrest.dosi.bean.Evaluation;

public interface EvaluationRepository extends CrudRepository<Evaluation, Integer> {
	List<Evaluation> findByEnseignantNoEnseignant(int noEnseignant);

}
