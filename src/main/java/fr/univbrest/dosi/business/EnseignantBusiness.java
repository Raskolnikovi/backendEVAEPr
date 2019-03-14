package fr.univbrest.dosi.business;

import java.util.List;

import fr.univbrest.dosi.bean.Enseignant;

public interface EnseignantBusiness {

	Enseignant creerEnseignant(Enseignant enseignantACreer);

	List<Enseignant> rechercheEnseignantParNom(String nom);

	List<Enseignant> recupererTousLesEnseignants();

	Enseignant rechercherEnseignantParId(long id);

	void supprimerEnseignantByID(long id);

	Enseignant rechercherParEmail(String email);
}
