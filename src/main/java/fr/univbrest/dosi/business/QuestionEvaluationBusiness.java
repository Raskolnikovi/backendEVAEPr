package fr.univbrest.dosi.business;

import java.util.List;

import fr.univbrest.dosi.bean.Message;
import fr.univbrest.dosi.bean.QuestionEvaluation;
import fr.univbrest.dosi.bean.RubriqueEvaluation;
import fr.univbrest.dosi.repositories.QuestionOnly;

public interface QuestionEvaluationBusiness {

	//List<RubriqueEvaluation> recupererToutesLesRubriques();
	List<QuestionOnly> recupererQuestionRubEval(int rubeval);
	void creerQstEval(QuestionEvaluation qstEvalAcreer);
	void modifierQstEval(QuestionEvaluation QstEvalAModifier);
	Message supprimerQstEval(int idQstEval);

}
