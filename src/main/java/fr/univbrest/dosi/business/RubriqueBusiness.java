package fr.univbrest.dosi.business;

import java.util.List;

import fr.univbrest.dosi.bean.Message;
import fr.univbrest.dosi.bean.Rubrique;

public interface RubriqueBusiness {
	
	Message ajouterRubrique(Rubrique r);
	Message modifierRubrique(Rubrique q);
	Message supprimerRubrique(Integer idRubrique);
	List<Rubrique> rechercherRubriques();
	Rubrique rechercherParId(String id);

}
