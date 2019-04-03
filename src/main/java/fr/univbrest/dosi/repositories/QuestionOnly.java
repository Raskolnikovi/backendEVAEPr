package fr.univbrest.dosi.repositories;

import fr.univbrest.dosi.bean.Question;
import fr.univbrest.dosi.bean.RubriqueEvaluation;

public interface QuestionOnly {
	int getIdQuestionEvaluation();
	String getOrdre();
	Question getQuestion();
	RubriqueEvaluation getRubriqueEvaluation();

}
