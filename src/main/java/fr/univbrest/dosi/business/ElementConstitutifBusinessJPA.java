package fr.univbrest.dosi.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.univbrest.dosi.bean.ElementConstitutif;
import fr.univbrest.dosi.bean.UniteEnseignementPK;
import fr.univbrest.dosi.repository.ElementConstitutifRepository;
import fr.univbrest.dosi.repository.EtudiantRepository;
@Component
public class ElementConstitutifBusinessJPA implements ElementConstitutifBusiness {
	private ElementConstitutifRepository repos ;
	
	@Autowired
	public ElementConstitutifBusinessJPA(ElementConstitutifRepository repos) {

		this.repos = repos;
	}
	@Override
	public List<ElementConstitutif> rechercherParUniteEnseignement(String codeUe, String codeFormation) {
		UniteEnseignementPK ue = new UniteEnseignementPK(codeFormation, codeUe);
		return repos.findByUniteEnseignementId(ue);
	}

}
