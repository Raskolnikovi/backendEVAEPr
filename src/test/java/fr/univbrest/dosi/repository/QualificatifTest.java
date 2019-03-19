package fr.univbrest.dosi.repository;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import fr.univbrest.dosi.bean.Qualificatif;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration
public class QualificatifTest {
	@Autowired
	  private QualificatifRepository qualificatifRepository;

	  @Test
	  public void saveTest() {
	    Qualificatif qualificatif = new Qualificatif("min","max");
	    qualificatifRepository.save(qualificatif);
	    Assert.assertNotNull(qualificatifRepository.findById(qualificatif.getIdQualificatif()));
	  }
}
