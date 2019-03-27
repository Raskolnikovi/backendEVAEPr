package fr.univbrest.dosi.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.univbrest.dosi.bean.Promotion;
import fr.univbrest.dosi.bean.PromotionPK;
import fr.univbrest.dosi.repositories.PromotionRepository;

@Component
public class PromotionBussinessJPA   implements  PromotionBussiness{
	
	private PromotionRepository repos ;	

	@Autowired 
	public PromotionBussinessJPA(PromotionRepository repos) {
		
		this.repos = repos;
	}

	@Override
	public Promotion creerPromotion(Promotion promotiontACreer) {
		// TODO Auto-generated method stub
		
		return repos.save(promotiontACreer);
	}

	@Override
	public void supprimerPromotion(Promotion promotionASupp) {
		// TODO Auto-generated method stub
		 repos.delete(promotionASupp);
	}

	
	@Override
	public void supprimerPromotionByID(PromotionPK promotionASuppPK) {
		//Optional<Promotion> p = repos.findById(promotionASuppPK);
		
	}
	@Override
	public List<Promotion> recupererTousLesPromotions() {
		// TODO Auto-generated method stub
		return (List<Promotion>) repos.findAll();
	}

	
	@Override
	public List<Promotion> rechercheParFormation(String codeFormation) {
		// TODO Auto-generated method stub
		List<Promotion> promoRecherche = repos.findByFormationCodeFormation(codeFormation);		
		return promoRecherche;
	}

	@Override
	public Promotion rechercherPromotionParId(PromotionPK PK) {
		// TODO Auto-generated method stub
		return new Promotion();
	}
	
	@Override
	public long nombrePromotions() {
		// TODO Auto-generated method stub
		return repos.count();
	}

	@Override
	public List<Promotion> rechercherParEnseignant(int noEnseignant) {
		List<Promotion> promoRecherche = repos.findByEnseignantNoEnseignant(noEnseignant);		
		return promoRecherche;
		
	}

	

}
