package fr.univbrest.dosi.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.univbrest.dosi.bean.Enseignant;
import fr.univbrest.dosi.repositories.EnseignantRepository;



@Component
public class EnseignantBusinessJPA implements EnseignantBusiness{

	private EnseignantRepository repos ;

	@Autowired 
	
	public EnseignantBusinessJPA(EnseignantRepository repos) {
		
		this.repos = repos;
	}

	@Override
	public Enseignant creerEnseignant(Enseignant enseignantACreer) {
		// TODO Auto-generated method stub
		//candidatACreer.setDateNaissance(new Date());
		return repos.save(enseignantACreer);
	}

	public void supprimerEnseignant(Enseignant enseignantASupp) {
		repos.delete(enseignantASupp);
	}
	

	@Override
	public List<Enseignant> rechercheEnseignantParNom(String nom) {
		List<Enseignant> enseignantRecherche = repos.findByNom(nom);
		return enseignantRecherche;
	}
	
	@Override
	public List<Enseignant> recupererTousLesEnseignants() {
		return (List<Enseignant>) repos.findAll();
	}
	@Override
	public Enseignant rechercherEnseignantParId(long id) {
		return repos.findByNoEnseignant(id);
	}
	@Override
	public Enseignant rechercherParEmail(String email)
	{
		return repos.findByEmailUbo(email);
	}

	@Override
	public void supprimerEnseignantByID(long id) {
		// TODO Auto-generated method stub
		Enseignant e = repos.findByNoEnseignant(id);
		repos.delete(e);
	}


	
	
}
