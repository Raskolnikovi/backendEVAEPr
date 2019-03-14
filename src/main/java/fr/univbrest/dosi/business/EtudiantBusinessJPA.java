package fr.univbrest.dosi.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.univbrest.dosi.bean.Etudiant;
import fr.univbrest.dosi.bean.PromotionPK;
import fr.univbrest.dosi.repository.EtudiantRepository;
import fr.univbrest.dosi.repository.FormationRepository;
import fr.univbrest.dosi.repository.PromotionRepository;

@Component
public class EtudiantBusinessJPA implements EtudiantBusiness {
	
	private EtudiantRepository repos ;
	
	@Autowired
	public EtudiantBusinessJPA(EtudiantRepository repos) {

		this.repos = repos;
	}
	
	@Override
	public List<Etudiant> rechercherParPromotion(String codeFormation, String anneeUniversitaire) {
		
		PromotionPK promotionPK = new PromotionPK(anneeUniversitaire, codeFormation);
		return repos.findEtudiantByPromotionId(promotionPK);
		//return  repos.findEtudiantByPromotionId("AAA");
	}
	
	@Override
	public void deleteEtudiantParID(String id) {
		 repos.deleteById(id);
	}


}
