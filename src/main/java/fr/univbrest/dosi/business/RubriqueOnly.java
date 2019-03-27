package fr.univbrest.dosi.business;

import fr.univbrest.dosi.bean.Rubrique;

public interface RubriqueOnly {
	int getIdRubriqueEvaluation();
	Rubrique getRubrique();
	String getDesignation();
	byte getOrdre();

}
