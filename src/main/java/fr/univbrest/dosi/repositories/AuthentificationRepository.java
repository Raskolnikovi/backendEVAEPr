package fr.univbrest.dosi.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.univbrest.dosi.bean.Authentification;


@Repository
public interface AuthentificationRepository extends CrudRepository<Authentification,Integer>{
	Authentification findByLoginConnectionAndMotPasse(String loginConnection, String motPasse);
	Authentification findByPseudoConnectionAndMotPasse(String pseudoConnection, String motPasse);
}