package fr.univbrest.dosi.repository;

import org.springframework.data.repository.CrudRepository;

import fr.univbrest.dosi.bean.Question;

public interface QuestionRepository extends CrudRepository<Question, Integer> {

}
