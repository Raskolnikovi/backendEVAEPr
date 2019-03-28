package fr.univbrest.dosi.business;

import java.util.List;

import fr.univbrest.dosi.bean.Promotion;
import fr.univbrest.dosi.bean.UniteEnseignement;

public interface UniteEnseignementBusiness {
	
	List<UniteEnseignement> rechercherParFormation(String codeFormation);
	List<UniteEnseignement> rechercherParEnseignant(int noEnseignant);
	List<UniteEnseignement> rechercherParFormationAndEnseignant(String codeFormation, int noEnseignant);

}
