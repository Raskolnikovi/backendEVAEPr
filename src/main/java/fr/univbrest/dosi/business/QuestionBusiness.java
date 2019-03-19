package fr.univbrest.dosi.business;

import java.util.List;

import fr.univbrest.dosi.bean.Message;
import fr.univbrest.dosi.bean.Question;

public interface QuestionBusiness {
	
	Message ajouterQuestion(Question q);
	Message modifierQuestion(Question q);
	Message supprimerQuestion(Integer idQuestion);
	List<Question> rechercherQuestions();
	Question rechercherParId(String id);

}
