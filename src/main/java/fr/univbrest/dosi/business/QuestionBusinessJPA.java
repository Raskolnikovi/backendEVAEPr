package fr.univbrest.dosi.business;

import java.util.List;

import javax.transaction.TransactionRolledbackException;
import javax.validation.ConstraintViolationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Component;

import fr.univbrest.dosi.bean.Message;
import fr.univbrest.dosi.bean.Question;
import fr.univbrest.dosi.repositories.QuestionRepository;
@Component
public class QuestionBusinessJPA implements QuestionBusiness {
	
	private QuestionRepository repos ;

	@Autowired 
	
	public QuestionBusinessJPA(QuestionRepository repos) {
		
		this.repos = repos;
	}
	@Override
	public Message ajouterQuestion(Question q) {
		try {
			repos.save(q);
			return new Message("Question ajoutée !");	 
		}catch(Exception e) {
			e.printStackTrace();
			return new Message("Erreur : Impossible ");	 
		}
	}
	

	
	@Override
	public Message modifierQuestion(Question q) {
		try {
			repos.save(q);
			return new Message("Modification valide! ");	 
		}catch(Exception e) {
			return new Message("Erreur : Impossible ");	 
		}
	}

	@Override
	public Message supprimerQuestion(Integer idQuestion) {
		try{
			repos.deleteById(idQuestion);
			return new Message("Suppression validée ");	 
		}catch (DataIntegrityViolationException e) {
			return new Message("Question utilisé dans une ou plusieurs evaluations!");	 
		}
		catch (Exception e) {
			return new Message("Erreur suppression : impossible!");	 			
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
