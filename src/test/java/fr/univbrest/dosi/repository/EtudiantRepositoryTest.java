package fr.univbrest.dosi.repository;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
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
import fr.univbrest.dosi.repositories.EtudiantRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = AppTestConfig.class)
@WebAppConfiguration
public class EtudiantRepositoryTest {
	
	@Autowired
    EtudiantRepository etudiantRepository;


    @Before
    public void setupEtudiants(){

        List<Etudiant> listEtudiant = new ArrayList<>();
        Etudiant etudiant = new Etudiant();
        etudiant.setNoEtudiant("aaa");
        etudiant.setAdresse("aaa");
        listEtudiant.add(etudiant);
        etudiant.setNoEtudiant("aaa");
        etudiant.setAdresse("bbb");
        listEtudiant.add(etudiant);
        etudiant.setNoEtudiant("aaa");
        etudiant.setAdresse("ccc");
        listEtudiant.add(etudiant);
        
        etudiantRepository.saveAll(listEtudiant);
    }
    
    @Test
    public void findEtudiant(){
        List<Etudiant> listEtudiant = new ArrayList<>();
        Etudiant etudiant = new Etudiant();
        etudiant.setNoEtudiant("aaa");
        etudiant.setAdresse("aaa");
        listEtudiant.add(etudiant);
        etudiant.setNoEtudiant("aaa");
        etudiant.setAdresse("bbb");
        listEtudiant.add(etudiant);
        etudiant.setNoEtudiant("aaa");
        etudiant.setAdresse("ccc");
        listEtudiant.add(etudiant);
        
        etudiantRepository.save(etudiant);
        //assertTrue(etudiantRepository.findAll.isEmpty());
    }
	

}
