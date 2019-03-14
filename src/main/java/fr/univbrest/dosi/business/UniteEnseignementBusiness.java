package fr.univbrest.dosi.business;

import java.util.List;

import fr.univbrest.dosi.bean.UniteEnseignement;

public interface UniteEnseignementBusiness {
	
	List<UniteEnseignement> rechercherParFormation(String codeFormation);

}
