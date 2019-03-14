package fr.univbrest.dosi.business;

import java.util.List;

import fr.univbrest.dosi.bean.Question;

public interface QuestionBusiness {
	
	String ajouterQuestion(Question q);
	String modifierQuestion(Question q);
	String supprimerQuestion(Integer idQuestion);
	List<Question> rechercherQuestions();
	Question rechercherParId(String id);

}
