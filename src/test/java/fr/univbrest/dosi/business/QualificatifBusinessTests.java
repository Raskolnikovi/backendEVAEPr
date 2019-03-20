package fr.univbrest.dosi.business;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import fr.univbrest.dosi.bean.Qualificatif;
import fr.univbrest.dosi.repositories.QualificatifRepository;


@RunWith(MockitoJUnitRunner.class)
public class QualificatifBusinessTests {
	
	@Mock
	QualificatifRepository qualificatifRepository;
	
	@InjectMocks
	QualificatifBusiness qualificatifBusiness;
	
	@Test
	public void whenSave() {
		Qualificatif qualificatif = new Qualificatif();
		qualificatif.setMaximal("vmaximal");
	}

}
