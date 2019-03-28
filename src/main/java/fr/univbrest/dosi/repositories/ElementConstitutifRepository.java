package fr.univbrest.dosi.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import fr.univbrest.dosi.bean.ElementConstitutif;
import fr.univbrest.dosi.bean.ElementConstitutifPK;
import fr.univbrest.dosi.bean.UniteEnseignementPK;

public interface ElementConstitutifRepository extends CrudRepository<ElementConstitutif, ElementConstitutifPK>  {

	List<ElementConstitutif> findByUniteEnseignementId(UniteEnseignementPK ue);
	List<ElementConstitutif> findByUniteEnseignementIdAndEnseignantNoEnseignant(UniteEnseignementPK ue, int noEnseignant);
	
}
