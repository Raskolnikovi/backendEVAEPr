package fr.univbrest.dosi.repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import fr.univbrest.dosi.AppTestConfig;
import fr.univbrest.dosi.bean.Formation;
import fr.univbrest.dosi.bean.Qualificatif;
import fr.univbrest.dosi.repositories.FormationRepository;
import fr.univbrest.dosi.repositories.QualificatifRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = AppTestConfig.class)
@WebAppConfiguration
public class FormationRepositoryTest {
	@Autowired
    FormationRepository formationRepository;
	
	@Before
    public void setupFormations(){
    	
		Formation formation1 = new Formation("M2DOSI", null, "M2", "O", new Date(), (byte) 2, "DOSI");
		formationRepository.save(formation1);
		Formation formation2 = new Formation("M1TIIL", null, "M2", "O", new Date(), (byte) 2, "TIIL");
		formationRepository.save(formation2);
		Formation formation3 = new Formation("M2TIIL", null, "M2", "O", new Date(), (byte) 2, "TIIL");
		formationRepository.save(formation3);
    }
	
	@Test
	public void doitCompterLesFormations() {
		
		long resultat = formationRepository.count();
		assertThat(resultat).isEqualTo(3);
	}
}
