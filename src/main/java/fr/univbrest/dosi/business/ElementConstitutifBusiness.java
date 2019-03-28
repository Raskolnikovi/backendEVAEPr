package fr.univbrest.dosi.business;

import java.util.List;

import fr.univbrest.dosi.bean.ElementConstitutif;


public interface ElementConstitutifBusiness {
	List<ElementConstitutif> rechercherParUniteEnseignement(String codeUe, String codeFormation);
	List<ElementConstitutif> rechercherParUniteEnseignementEnseignant(String codeUe, String codeFormation, int noEnseignant);
	
}
