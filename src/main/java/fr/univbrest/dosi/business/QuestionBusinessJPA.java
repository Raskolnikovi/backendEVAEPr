package fr.univbrest.dosi.business;

import java.util.List;

import javax.transaction.TransactionRolledbackException;
import javax.validation.ConstraintViolationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Component;

import fr.univbrest.dosi.bean.Question;
import fr.univbrest.dosi.repository.QuestionRepository;
@Component
public class QuestionBusinessJPA implements QuestionBusiness {
	
	private QuestionRepository repos ;

	@Autowired 
	
	public QuestionBusinessJPA(QuestionRepository repos) {
		
		this.repos = repos;
	}
	@Override
	public String ajouterQuestion(Question q) {
		try {
			repos.save(q);
			return "Question Ajouté";
		}catch(Exception e) {
			e.printStackTrace();
			return "Question ERR";
		}
	}
	

	
	@Override
	public String modifierQuestion(Question q) {
		try {
			repos.save(q);
			return "Question Modifié";
		}catch(Exception e) {
			return "Erreur Modification";
		}
	}

	@Override
	public String supprimerQuestion(Integer idQuestion) {
		try{
			repos.deleteById(idQuestion);
			return "Question supprimé";
		}catch (DataIntegrityViolationException e) {
		    	return "Question utilisé dans une ou plusieurs evaluations!";
		}
		catch (Exception e) {
	    	return "Erreur suppression : DATABASE!";
	}
	}

	@Override
	public List<Question> rechercherQuestions() {
		return (List<Question>) repos.findAll();
	}

	@Override
	public Question rechercherParId(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
