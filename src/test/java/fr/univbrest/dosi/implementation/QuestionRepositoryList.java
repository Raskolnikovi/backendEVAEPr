package fr.univbrest.dosi.implementation;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import fr.univbrest.dosi.bean.Question;
import fr.univbrest.dosi.repositories.*;

public class QuestionRepositoryList implements QuestionRepository{
private List<Question> questions;
 public QuestionRepositoryList() {
	 questions = new ArrayList<>();
 }
	@Override
	public <S extends Question> S save(S entity) {
		
		this.questions.add(entity);
		return entity;
	}

	@Override
	public <S extends Question> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Question> findById(Integer id) {
		return questions.stream().filter(question -> question.getIdQuestion() == id).findAny();
		 
		
	}

	@Override
	public boolean existsById(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Question> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Question> findAllById(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		return (long)questions.size();	}

	@Override
	public void deleteById(Integer id) {
		questions.removeIf(question -> question.getIdQuestion() == id);
		
	}

	@Override
	public void delete(Question entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Question> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}
}