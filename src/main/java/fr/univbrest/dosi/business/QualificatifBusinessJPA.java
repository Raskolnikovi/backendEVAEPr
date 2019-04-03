package fr.univbrest.dosi.business;

import java.util.List;

import javax.transaction.TransactionRolledbackException;
import javax.validation.ConstraintViolationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Component;

import fr.univbrest.dosi.bean.Message;
import fr.univbrest.dosi.bean.Qualificatif;
import fr.univbrest.dosi.repositories.QualificatifRepository;
@Component
public class QualificatifBusinessJPA implements QualificatifBusiness {
	
	private QualificatifRepository repos ;

	@Autowired 
	
	public QualificatifBusinessJPA(QualificatifRepository repos) {
		
		this.repos = repos;
	}
	@Override
	public Message ajouterQualificatif(Qualificatif q) {
		try {
			repos.save(q);
			return new Message("Qualificatif Ajouté");	 
		}catch(Exception e) {
			return new Message("Erreur : Ajout impossible ");	 
		}
	}
	

	
	@Override
	public Message modifierQualificatif(Qualificatif q) {
		try {
			repos.save(q);
			return new Message("Qualificatif Modifié ");	 
		}catch(Exception e) {
			return new Message("Erreur : Modification impossible ");	 
		}
	}

	@Override
	public Message supprimerQualificatif(Integer idQualificatif) {
		try{
			repos.deleteById(idQualificatif);
			return new Message("Qualificatif supprimé ");	 
		}catch (DataIntegrityViolationException e) {
			return new Message("Erreur : Qualificatif utilisé dans une ou plusieurs questions ");	 
		}
		catch (Exception e) {
			return new Message("Erreur : Base de données ");	 
	}
	}

	@Override
	public List<Qualificatif> rechercherQualificatifs() {
		return (List<Qualificatif>) repos.findAll();
	}

	@Override
	public Qualificatif rechercherParId(String id) {
		return new Qualificatif();
	}
	@Override
	public long NombreQualificatifs() {
		// TODO Auto-generated method stub
		return repos.count();
	}
	
	

}
