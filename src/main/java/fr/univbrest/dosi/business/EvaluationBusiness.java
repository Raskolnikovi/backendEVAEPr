package fr.univbrest.dosi.business;

import java.util.List;

import fr.univbrest.dosi.bean.Evaluation;
import fr.univbrest.dosi.bean.Message;

public interface EvaluationBusiness {
	
	void creerEvaluation(Evaluation evaluationACreer) throws Exception;

	List<Evaluation> recupererTousLesEvaluations();

	List<Evaluation> recupererEvaluationsParEnseignant(int noEnseignant);

}
