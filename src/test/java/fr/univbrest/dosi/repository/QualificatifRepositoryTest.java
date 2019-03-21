package fr.univbrest.dosi.repository;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import fr.univbrest.dosi.AppTestConfig;
import fr.univbrest.dosi.bean.Etudiant;
import fr.univbrest.dosi.bean.Qualificatif;
import fr.univbrest.dosi.repositories.EtudiantRepository;
import fr.univbrest.dosi.repositories.QualificatifRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = AppTestConfig.class)
@WebAppConfiguration
public class QualificatifRepositoryTest {
	@Autowired
    QualificatifRepository qualificatifRepository;


    @Before
    public void setupQualificatifs(){
    	
        Qualificatif qualificatif1 = new Qualificatif("min","max");
        Qualificatif qualificatif2 = new Qualificatif("min2","max2");
        Qualificatif qualificatif3 = new Qualificatif("min3","max3");
        
        qualificatifRepository.save(qualificatif1);
        qualificatifRepository.save(qualificatif2);
        qualificatifRepository.save(qualificatif3);        

    }
    
	@Test
	public void doitCompterLesQualificatifs() {
		
		long resultat = qualificatifRepository.count();
		assertThat(resultat).isEqualTo(3);
	}
}
