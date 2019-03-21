package fr.univbrest.dosi.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Component;

import fr.univbrest.dosi.bean.Message;
import fr.univbrest.dosi.bean.Question;
import fr.univbrest.dosi.bean.Rubrique;
import fr.univbrest.dosi.repositories.RubriqueRepository;
@Component
public class RubriqueBusinessJPA implements RubriqueBusiness {
	
	private RubriqueRepository repos ;

	@Autowired 
	
	public RubriqueBusinessJPA(RubriqueRepository repos) {
		
		this.repos = repos;
	}
	
	@Override
	public Message ajouterRubrique(Rubrique r) {
		try {
			repos.save(r);
			return new Message("Rubrique ajoutée !");	 
		}catch(Exception e) {
			e.printStackTrace();
			return new Message("Erreur : Ajout Impossible ");	 
		}
	}

	@Override
	public Message modifierRubrique(Rubrique r) {
		try {
			repos.save(r);
			return new Message("Modification valide! ");	 
		}catch(Exception e) {
			return new Message("Erreur : Modification Impossible ");	 
		}
	}

	@Override
	public Message supprimerRubrique(Integer idRubrique) {
		try{
			repos.deleteById(idRubrique);
			return new Message("Suppression validée ");	 
		}catch (DataIntegrityViolationException e) {
			return new Message("Rubrique utilisé dans une ou plusieurs evaluations/questions!");	 
		}
		catch (Exception e) {
			return new Message("Erreur suppression : impossible!");	 			
		}
	}

	@Override
	public List<Rubrique> rechercherRubriques() {
		return (List<Rubrique>) repos.findAll();
	}

	@Override
	public Rubrique rechercherParId(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
