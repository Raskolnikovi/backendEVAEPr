package fr.univbrest.dosi.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Component;

import fr.univbrest.dosi.bean.Message;
import fr.univbrest.dosi.bean.RubriqueEvaluation;
import fr.univbrest.dosi.repositories.RubriqueEvaluationRepository;

@Component
public class RubriqueEvaluationBusinessJPA implements RubriqueEvaluationBusiness {
	
	private RubriqueEvaluationRepository repos ;
	
	@Autowired
	public RubriqueEvaluationBusinessJPA(RubriqueEvaluationRepository repos) {
		this.repos = repos;
	}
	
	@Override
	public List<RubriqueEvaluation> recupererToutesLesRubriques() {
		return (List<RubriqueEvaluation>) repos.findAll();
	}

	@Override
	public List<RubriqueOnly> recupererRubriqueEval(int eval) {
		return (List<RubriqueOnly>) repos.findByEvaluationIdEvaluationOrderByOrdreAsc(eval);
	}

	@Override
	public void creerRubEval(RubriqueEvaluation rubEvalACreer) {
		
		repos.save(rubEvalACreer);
		
	}

	@Override
	public void modifierRubEval(RubriqueEvaluation rubEvalAModifier) {
		repos.save(rubEvalAModifier);
		
	}

	@Override
	public Message supprimerRubEval(int idRubEval) {
		try{
			repos.deleteById(idRubEval);
			return new Message("Rubrique supprimé ");	 
		}catch (DataIntegrityViolationException e) {
			return new Message("Erreur : Rubrique contient une ou plusieurs questions ");	 
		}
		catch (Exception e) {
			return new Message("Erreur : Base de données ");	 
	}
	}

}
