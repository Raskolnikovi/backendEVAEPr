package fr.univbrest.dosi.business;

import java.util.List;

import fr.univbrest.dosi.bean.Evaluation;
import fr.univbrest.dosi.bean.Message;

public interface EvaluationBusiness {
	
	Message creerEvaluation(Evaluation evaluationACreer);

	List<Evaluation> recupererTousLesEvaluations();

}
