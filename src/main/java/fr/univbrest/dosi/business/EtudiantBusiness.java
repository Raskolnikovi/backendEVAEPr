package fr.univbrest.dosi.business;

import java.util.List;

import fr.univbrest.dosi.bean.*;

public interface EtudiantBusiness {
	
	List<Etudiant> rechercherParPromotion(String codeFormation, String anneeUniversitaire);
	Message deleteEtudiantParID(String id);
}
