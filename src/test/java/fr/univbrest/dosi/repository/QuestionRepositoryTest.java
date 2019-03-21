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
import fr.univbrest.dosi.bean.Question;
import fr.univbrest.dosi.repositories.QuestionRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = AppTestConfig.class)
@WebAppConfiguration
public class QuestionRepositoryTest {
	@Autowired
    QuestionRepository QuestionRepository;


    @Before
    public void setupQuestions(){
    	
        Question Question1 = new Question("min","max", null, null);
        Question Question2 = new Question("min2","max2", null, null);
        Question Question3 = new Question("min3","max3", null, null);
        
        QuestionRepository.save(Question1);
        QuestionRepository.save(Question2);
        QuestionRepository.save(Question3);        

    }
    @Test
	public void doitCompterLesQuestions() {
		
		long resultat = QuestionRepository.count();
		assertThat(resultat).isEqualTo(3);
	}

}
