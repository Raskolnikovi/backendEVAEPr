package fr.univbrest.dosi.business;

import java.util.List;

import fr.univbrest.dosi.bean.Qualificatif;

public interface QualificatifBusiness {
	String ajouterQualificatif(Qualificatif q);
	String modifierQualificatif(Qualificatif q);
	String supprimerQualificatif(Integer idQualificatif);
	List<Qualificatif> rechercherQualificatifs();
	Qualificatif rechercherParId(String id);

}
