package fr.univbrest.dosi.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Component;

import fr.univbrest.dosi.bean.Message;
import fr.univbrest.dosi.bean.QuestionEvaluation;
import fr.univbrest.dosi.bean.RubriqueEvaluation;
import fr.univbrest.dosi.repositories.QuestionEvaluationRepository;
import fr.univbrest.dosi.repositories.QuestionOnly;
import fr.univbrest.dosi.repositories.RubriqueEvaluationRepository;
@Component
public class QuestionEvaluationBusinessJPA implements QuestionEvaluationBusiness {
	
	private QuestionEvaluationRepository repos ;
	
	@Autowired
	public QuestionEvaluationBusinessJPA(QuestionEvaluationRepository repos) {
		this.repos = repos;
	}

	@Override
	public List<QuestionOnly> recupererQuestionRubEval(int rubeval) {
		return (List<QuestionOnly>) repos.findByRubriqueEvaluationIdRubriqueEvaluationOrderByOrdreAsc(rubeval);
	}

	@Override
	public void creerQstEval(QuestionEvaluation qstEvalACreer) {
		QuestionEvaluation rb = repos.findFirstByRubriqueEvaluationIdRubriqueEvaluationOrderByOrdreDesc(qstEvalACreer.getRubriqueEvaluation().getIdRubriqueEvaluation());
		qstEvalACreer.setOrdre(rb.getOrdre()+1);
		repos.save(qstEvalACreer);
		
	}

	@Override
	public void modifierQstEval(QuestionEvaluation QstEvalAModifier) {
		repos.save(QstEvalAModifier);
		
	}

	@Override
	public Message supprimerQstEval(int idQstEval) {
		try{
			repos.deleteById(idQstEval);
			return new Message("Question supprimée ");	 
		}catch (DataIntegrityViolationException e) {
			return new Message("Erreur : Contrainte");	 
		}
		catch (Exception e) {
			return new Message("Erreur : Base de données ");	 
	}
	}

}
