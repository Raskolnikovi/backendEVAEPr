package fr.univbrest.dosi.business;

import java.util.List;

import javax.transaction.TransactionRolledbackException;
import javax.validation.ConstraintViolationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Component;

import fr.univbrest.dosi.bean.Qualificatif;
import fr.univbrest.dosi.repository.QualificatifRepository;
@Component
public class QualificatifBusinessJPA implements QualificatifBusiness {
	
	private QualificatifRepository repos ;

	@Autowired 
	
	public QualificatifBusinessJPA(QualificatifRepository repos) {
		
		this.repos = repos;
	}
	@Override
	public String ajouterQualificatif(Qualificatif q) {
		try {
			repos.save(q);
			return "Qualificatif Ajouté";
		}catch(Exception e) {
			return "Erreur Ajout";
		}
	}
	

	
	@Override
	public String modifierQualificatif(Qualificatif q) {
		try {
			repos.save(q);
			return "Qualificatif Modifié";
		}catch(Exception e) {
			return "Erreur Modification";
		}
	}

	@Override
	public String supprimerQualificatif(Integer idQualificatif) {
		try{
			repos.deleteById(idQualificatif);
			return "Qualificatif supprimé";
		}catch (DataIntegrityViolationException e) {
		    	return "Qualificatif utilisé dans une ou plusieurs questions!";
		}
		catch (Exception e) {
	    	return "Erreur suppression : DATABASE!";
	}
	}

	@Override
	public List<Qualificatif> rechercherQualificatifs() {
		return (List<Qualificatif>) repos.findAll();
	}

	@Override
	public Qualificatif rechercherParId(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
