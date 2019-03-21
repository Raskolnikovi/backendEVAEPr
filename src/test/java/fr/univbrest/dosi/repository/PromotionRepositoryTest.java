package fr.univbrest.dosi.repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import fr.univbrest.dosi.AppTestConfig;
import fr.univbrest.dosi.bean.Etudiant;
import fr.univbrest.dosi.bean.Formation;
import fr.univbrest.dosi.bean.Promotion;
import fr.univbrest.dosi.bean.PromotionPK;
import fr.univbrest.dosi.repositories.FormationRepository;
import fr.univbrest.dosi.repositories.PromotionRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = AppTestConfig.class)
@WebAppConfiguration
public class PromotionRepositoryTest {
	@Autowired
	private PromotionRepository promotionRepo;
	@Autowired
	private FormationRepository formationRepo;
	
	@Before
    public void setupPromotions(){
    	Formation formation1 = new Formation("M2DOSI", null, "M2", "O", new Date(), (byte) 2, "DOSI");
		formationRepo.save(formation1);
		Promotion promotion1 = new Promotion(new PromotionPK("2017-2018","M2DOSI"), "Micro 2.2", "DOSI10");
		Promotion promotion2 = new Promotion(new PromotionPK("2018-2019","M2DOSI"), "Micro 1.2", "DOSI11");
		promotionRepo.save(promotion1);
		promotionRepo.save(promotion2);
	}
	
	
	@Test
	public void doitCompterLesPromotions() {
		
		long resultat = promotionRepo.count();
		System.out.println("??" + resultat);
		assertThat(resultat).isEqualTo(2);
	}
	@Test
	public void doitRechercherParCodeFormation() {
		List<Promotion> resultat = promotionRepo.findByFormationCodeFormation("M2DOSI");
		assertThat(resultat).hasSize(2);

	}
}
