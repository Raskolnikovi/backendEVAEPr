package fr.univbrest.dosi.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import fr.univbrest.dosi.bean.Etudiant;
import fr.univbrest.dosi.bean.PromotionPK;

public interface EtudiantRepository extends CrudRepository<Etudiant, String> {
	
	List<Etudiant> findEtudiantByPromotionId(PromotionPK promotionPK);
	List<Etudiant> findByAdresse(String adresse);
	

}
