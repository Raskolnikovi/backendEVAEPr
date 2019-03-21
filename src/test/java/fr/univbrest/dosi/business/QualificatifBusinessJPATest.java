package fr.univbrest.dosi.business;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;



import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.springframework.data.repository.CrudRepository;

import com.google.common.collect.Lists;
import org.junit.runners.MethodSorters;
import fr.univbrest.dosi.bean.Enseignant;
import fr.univbrest.dosi.bean.Message;
import fr.univbrest.dosi.bean.Qualificatif;
import fr.univbrest.dosi.bean.Question;
import fr.univbrest.dosi.business.QuestionBusinessJPA;
import fr.univbrest.dosi.implementation.QualificatifRepositoryList;
import fr.univbrest.dosi.repositories.*;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class QualificatifBusinessJPATest {
	private static QualificatifRepository qualificatifrepository;
	private static QualificatifBusinessJPA qualificatifbusinessjpa;
	
	@Before
	public void setup() {
		qualificatifrepository = new QualificatifRepositoryList();
		qualificatifbusinessjpa = new QualificatifBusinessJPA(qualificatifrepository);
	}
	
	@Test
	public void TestajoutQualificatif()
	{
		qualificatifbusinessjpa.ajouterQualificatif(new Qualificatif("Bad","Very good"));
		qualificatifbusinessjpa.ajouterQualificatif(new Qualificatif("Very Bad"," good"));
		assertThat(qualificatifbusinessjpa.NombreQualificatifs()).isEqualTo(2L);
	}
	@Test
	public void TestsuppressionQualificatif()
	{
		qualificatifbusinessjpa.ajouterQualificatif(new Qualificatif(55,"Bad","Very good"));
		qualificatifbusinessjpa.ajouterQualificatif(new Qualificatif("Very Bad"," good"));
		qualificatifbusinessjpa.supprimerQualificatif(55);
		assertThat(qualificatifbusinessjpa.NombreQualificatifs()).isEqualTo(1L);

	}
	@Test
	public void TestModifierQualificatif()
	{
		Qualificatif q1=new Qualificatif("Bad","Very good");
		
		Qualificatif q2=new Qualificatif("Bad","Very good");
		q2=new Qualificatif("Bad","Very good");
		qualificatifbusinessjpa.ajouterQualificatif(q1);
		qualificatifbusinessjpa.ajouterQualificatif(q2);
		Message mes=qualificatifbusinessjpa.modifierQualificatif(q2);
		assertThat(mes.equals("Qualificatif Modifié "));

	}
}
