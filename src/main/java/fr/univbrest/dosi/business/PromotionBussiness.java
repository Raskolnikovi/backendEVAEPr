package fr.univbrest.dosi.business;

import java.util.List;

import fr.univbrest.dosi.bean.Promotion;
import fr.univbrest.dosi.bean.PromotionPK;

public interface PromotionBussiness {

	Promotion creerPromotion(Promotion promotiontACreer);
	void supprimerPromotion(Promotion promotionASupp);
	List<Promotion> recupererTousLesPromotions();
	Promotion rechercherPromotionParId(PromotionPK PK );
	void supprimerPromotionByID(PromotionPK promotionASuppPK);
	public List<Promotion> rechercheParFormation(String codeFormation);
	List<Promotion> rechercherParEnseignant(int noEnseignant);
	long nombrePromotions();
	

}
