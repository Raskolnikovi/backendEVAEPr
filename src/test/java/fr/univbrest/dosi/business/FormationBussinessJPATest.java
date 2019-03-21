package fr.univbrest.dosi.business;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertThat;
import java.math.BigDecimal;
import java.util.Date;

import org.junit.Test;

import fr.univbrest.dosi.bean.Formation;
import fr.univbrest.dosi.implementation.FormationRepositoryList;
import fr.univbrest.dosi.repositories.*;

public class FormationBussinessJPATest {
FormationBusinessJPA formationBusiness;
	
	@Test
	public void doitCreerUneFormation() {
		FormationRepository repos = new FormationRepositoryList();
		formationBusiness = new FormationBusinessJPA(repos);
		Formation formation = new Formation("M2DOSI", null, "M2", "O", new Date(), (byte) 2, "DOSI");
		
		Formation resultat = formationBusiness.creerFormation(formation);
		System.out.println(resultat.getDebutAccreditation());
		assertThat(resultat.getDebutAccreditation()).isCloseTo(new Date(), 500);
		assertThat(repos.count()).isEqualTo(1);		
	}
}
