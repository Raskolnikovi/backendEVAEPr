package  fr.univbrest.dosi.business;
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
import fr.univbrest.dosi.repositories.*;
import fr.univbrest.dosi.implementation.QuestionRepositoryList;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class QuestionBusinessJPATest {
	
	private static QuestionBusinessJPA questionBusinessJPA;
	private static  QuestionRepository questionRepository;
	@Before
	public void setup() {
		questionRepository = new QuestionRepositoryList();
		questionBusinessJPA =  new QuestionBusinessJPA(questionRepository);
		
	}
	
	@Test
	public void testAjoutQuestion() {
		Question Q1= new Question("Q969","nimporte",new Enseignant("RGUIG","Ahmed"),new Qualificatif("bueno","not bueno"));
		Question Q2= new Question("Q69","nimporte",new Enseignant("MDS","Abdou"),new Qualificatif("bueno","not bueno"));
		questionBusinessJPA.ajouterQuestion(Q1);
		questionBusinessJPA.ajouterQuestion(Q2);
		assertThat(questionBusinessJPA.nombreQuestion()).isEqualTo(2);
	}
	
	
	   @Test
	   public void SupprimerQuestion() {
		   Question Q1= new Question(99,"Q969","nimporte",new Enseignant("RGUIG","Ahmed"),new Qualificatif("bueno","not bueno"));
			Question Q2= new Question("Q69","nimporte",new Enseignant("MDS","Abdou"),new Qualificatif("bueno","not bueno"));
			questionBusinessJPA.ajouterQuestion(Q1);
			questionBusinessJPA.ajouterQuestion(Q2);
			questionBusinessJPA.supprimerQuestion(99);
		   
			assertThat(questionBusinessJPA.nombreQuestion()).isEqualTo(1);

	   }
	   

	@Test
	public void TestModifierQuestion() {
		Question Q1= new Question("Q969","nimporte",new Enseignant("RGUIG","Ahmed"),new Qualificatif("bueno","not bueno"));
		Question Q2= new Question("Q69","nimporte",new Enseignant("MDS","Abdou"),new Qualificatif("bueno","not bueno"));
		 Q2= new Question("Q69","nimporte",new Enseignant("MDS","Abdou"),new Qualificatif("bueno","not bueno"));
		 questionBusinessJPA.ajouterQuestion(Q1);
			questionBusinessJPA.ajouterQuestion(Q2);
		 Message mes=questionBusinessJPA.modifierQuestion(Q2);
		 assertThat(mes.equals("Modification valide! "));
	
	
	}
	
}
