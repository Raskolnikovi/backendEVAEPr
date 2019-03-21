package fr.univbrest.dosi.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import fr.univbrest.dosi.bean.Qualificatif;
import fr.univbrest.dosi.repositories.*;

public class QualificatifRepositoryList implements QualificatifRepository{
  List<Qualificatif> qualificatifs;
  
  public QualificatifRepositoryList()
  {
	  qualificatifs=new ArrayList<>();
  }
  
	@Override
	public <S extends Qualificatif> S save(S entity) {
		qualificatifs.add(entity);
		return entity;
	}

	@Override
	public <S extends Qualificatif> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Qualificatif> findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Qualificatif> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Qualificatif> findAllById(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return qualificatifs.size();
	}

	@Override
	public void deleteById(Integer id) {
		qualificatifs.removeIf(qualificatif -> qualificatif.getIdQualificatif()== id);		
	}

	@Override
	public void delete(Qualificatif entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Qualificatif> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

}
