package fr.univbrest.dosi.business;

import java.util.List;


import fr.univbrest.dosi.repositories.QuestionOnly;

public interface QuestionEvaluationBusiness {

	//List<RubriqueEvaluation> recupererToutesLesRubriques();
	List<QuestionOnly> recupererQuestionRubEval(int rubeval);

}
