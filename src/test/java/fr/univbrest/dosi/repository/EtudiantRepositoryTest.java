package fr.univbrest.dosi.repository;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;
import java.util.ArrayList;
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
import fr.univbrest.dosi.repositories.EtudiantRepository;
import fr.univbrest.dosi.repositories.FormationRepository;
import fr.univbrest.dosi.repositories.PromotionRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = AppTestConfig.class)
@WebAppConfiguration
public class EtudiantRepositoryTest {
	
	@Autowired
    EtudiantRepository etudiantRepository;
	@Autowired
	private PromotionRepository promotionRepo;
	@Autowired
	private FormationRepository formationRepo;


    @Before
    public void setupEtudiants(){
    	Formation formation1 = new Formation("M2DOSI", null, "M2", "O", new Date(), (byte) 2, "DOSI");
		formationRepo.save(formation1);
		Promotion promotion1 = new Promotion(new PromotionPK("2017-2018","M2DOSI"), "Micro 2.2", "DOSI10");
		Promotion promotion2 = new Promotion(new PromotionPK("2018-2019","M2DOSI"), "Micro 1.2", "DOSI11");
		promotionRepo.save(promotion1);
		promotionRepo.save(promotion2);
		
        Etudiant etudiant = new Etudiant();
        etudiant.setNoEtudiant("aaa");
        etudiant.setNom("Yassine");
        etudiant.setAdresse("aaa");                        
        etudiant.setPromotion(promotion1);
        
        
        etudiantRepository.save(etudiant);
        Etudiant etudiant1 = new Etudiant();
        etudiant1.setNoEtudiant("bbb");
        etudiant1.setAdresse("bbb");
        etudiantRepository.save(etudiant1);
        Etudiant etudiant2 = new Etudiant();
        etudiant2.setNoEtudiant("ccc");
        etudiant2.setAdresse("ccc");        
        etudiantRepository.save(etudiant2);
    }
    

    
	@Test
	public void doitCompterLesEtudiants() {
		
		long resultat = etudiantRepository.count();
		System.out.println("??" + resultat);
		assertThat(resultat).isEqualTo(3);
	}
	@Test
	public void doitRechercherParNom() {
		List<Etudiant> resultat = etudiantRepository.findByAdresse("aaa");
		assertThat(resultat).hasSize(1);
		assertThat(resultat.get(0).getNom()).isEqualTo("Yassine");
		assertThat(resultat.get(0).getNoEtudiant()).isEqualTo("aaa");
	}
	
	@Test
	public void doitRechercherParPromotion() {
		PromotionPK pk = new PromotionPK("2017-2018","M2DOSI");
		List<Etudiant> resultat = etudiantRepository.findEtudiantByPromotionId(pk);
		assertThat(resultat).hasSize(1);
		assertThat(resultat.get(0).getNom()).isEqualTo("Yassine");
		assertThat(resultat.get(0).getNoEtudiant()).isEqualTo("aaa");
	}


	

}
