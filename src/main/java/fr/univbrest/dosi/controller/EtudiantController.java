package fr.univbrest.dosi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import fr.univbrest.dosi.bean.Erreur;
import fr.univbrest.dosi.bean.Etudiant;
import fr.univbrest.dosi.business.EtudiantBusiness;


@RestController
//@CrossOrigin(origins = "http://localhost:3333", maxAge = 3600)
@RequestMapping("/etudiants")
public class EtudiantController {
	
	private EtudiantBusiness etudiantBusiness;
	
	@Autowired
	public EtudiantController(EtudiantBusiness business) {
		this.etudiantBusiness = business;
	}
	
	@RequestMapping(value="/delete/{noEtudiant}" ,method = RequestMethod.DELETE)
	public Erreur DeleteEtudiant(@PathVariable("noEtudiant") String noEtudiant)
	{
		try
		{
			this.etudiantBusiness.deleteEtudiantParID(noEtudiant);
			return new Erreur("Etudiant supprimé");
		}catch (Exception ex) 
			{
	         ex.getMessage();
	         return new Erreur("Erreur : Impossible ");	      
	  	    }
	}
	

	@RequestMapping(method=RequestMethod.GET, value="/pro/{codeFormation}/{anneeUniversitaire}")
	public List<Etudiant> recupererCandidatParID(@PathVariable String codeFormation,@PathVariable String anneeUniversitaire) {
		return etudiantBusiness.rechercherParPromotion(codeFormation,anneeUniversitaire);
		
	}
	

}
