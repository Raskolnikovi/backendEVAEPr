package fr.univbrest.dosi.business;

import java.util.List;

import fr.univbrest.dosi.bean.Message;
import fr.univbrest.dosi.bean.Qualificatif;

public interface QualificatifBusiness {
	Message ajouterQualificatif(Qualificatif q);
	Message modifierQualificatif(Qualificatif q);
	Message supprimerQualificatif(Integer idQualificatif);
	List<Qualificatif> rechercherQualificatifs();
	Qualificatif rechercherParId(String id);

}
