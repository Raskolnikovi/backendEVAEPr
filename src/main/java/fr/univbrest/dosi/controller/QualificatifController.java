package fr.univbrest.dosi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import fr.univbrest.dosi.bean.Candidat;
import fr.univbrest.dosi.bean.Formation;
import fr.univbrest.dosi.bean.Qualificatif;
import fr.univbrest.dosi.business.CandidatBusiness;
import fr.univbrest.dosi.business.QualificatifBusiness;


@RestController
//@CrossOrigin(origins = "http://localhost:5500", maxAge = 3600)
@RequestMapping("/qualificatif")
public class QualificatifController {
	private QualificatifBusiness qualificatifbusiness;
	
	@Autowired
	public QualificatifController(QualificatifBusiness business) {
		this.qualificatifbusiness = business;
	}
	

	@RequestMapping(method = RequestMethod.POST)
	public String ajouterQualificatif(@RequestBody Qualificatif qualificatif){
		return qualificatifbusiness.ajouterQualificatif(qualificatif);
	}
	@RequestMapping(method = RequestMethod.PUT)
	public String miseAjourdeQualificatif(@RequestBody Qualificatif qualificatifAMaj) {
		return qualificatifbusiness.modifierQualificatif(qualificatifAMaj);
	}
	@RequestMapping(method = RequestMethod.GET)
	public List<Qualificatif> recupererToutesLesQualificatifs() {
		return qualificatifbusiness.rechercherQualificatifs();
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value="/Supp/{idQualificatif}")
	public String supprimerFormation(@PathVariable Integer idQualificatif) {
		return qualificatifbusiness.supprimerQualificatif(idQualificatif);
	}
	


}
