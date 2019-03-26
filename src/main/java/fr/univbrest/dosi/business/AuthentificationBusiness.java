package fr.univbrest.dosi.business;

import java.util.List;

import fr.univbrest.dosi.bean.Authentification;

public interface AuthentificationBusiness {
	
	List<Authentification> recupererTousLesusers();
	Authentification SearchByEmail(String email);

}
