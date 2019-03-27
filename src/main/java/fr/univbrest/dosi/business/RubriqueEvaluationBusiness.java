package fr.univbrest.dosi.business;

import java.util.List;

import fr.univbrest.dosi.bean.Evaluation;
import fr.univbrest.dosi.bean.Message;
import fr.univbrest.dosi.bean.Rubrique;
import fr.univbrest.dosi.bean.RubriqueEvaluation;

public interface RubriqueEvaluationBusiness {

	List<RubriqueEvaluation> recupererToutesLesRubriques();
	List<RubriqueOnly> recupererRubriqueEval(int eval);
	void creerRubEval(RubriqueEvaluation rubEvalACreer);
	void modifierRubEval(RubriqueEvaluation rubEvalAModifier);
	Message supprimerRubEval(int idRubEval);

}
