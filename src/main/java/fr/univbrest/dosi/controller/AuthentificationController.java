package fr.univbrest.dosi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.univbrest.dosi.bean.Authentification;
import fr.univbrest.dosi.business.AuthentificationBusinessJPA;

@RestController
@RequestMapping("/users")
public class AuthentificationController {
	private AuthentificationBusinessJPA authentificationBuisness;

	@Autowired
	public AuthentificationController(AuthentificationBusinessJPA business) {
		this.authentificationBuisness = business;
	}

	//fonction qui affiche tout les utilisateurs
	@GetMapping("/all")
	public List<Authentification> recupererTousLesusers() {
		return authentificationBuisness.recupererTousLesusers();
	}
//em:.+
	//fonction qui cherche un utilisateur par email
	@GetMapping("/email/{em:.+}")
	public Authentification SearchByEmail(@PathVariable("em") String em) throws Exception {
		
		return authentificationBuisness.SearchByEmail(em);
	}

}