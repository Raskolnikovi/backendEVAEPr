package fr.univbrest.dosi.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.univbrest.dosi.bean.UniteEnseignement;
import fr.univbrest.dosi.repository.UniteEnseignementRepository;
@Service
public class UniteEnseignementBusinessJPA implements UniteEnseignementBusiness {
	
	UniteEnseignementRepository repos ;

	@Autowired 
	public UniteEnseignementBusinessJPA(UniteEnseignementRepository repos) {		
		this.repos = repos;
	}
	
	@Override
	public List<UniteEnseignement> rechercherParFormation(String codeFormation) {
		return repos.findUniteEnseignementByFormationCodeFormation(codeFormation);
	}

}
