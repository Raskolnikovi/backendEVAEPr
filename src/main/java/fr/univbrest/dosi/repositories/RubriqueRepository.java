package fr.univbrest.dosi.repositories;

import org.springframework.data.repository.CrudRepository;

import fr.univbrest.dosi.bean.Question;
import fr.univbrest.dosi.bean.Rubrique;

public interface RubriqueRepository extends CrudRepository<Rubrique, Integer> {

}
