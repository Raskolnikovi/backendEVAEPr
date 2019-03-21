package fr.univbrest.dosi.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import fr.univbrest.dosi.bean.Formation;
import fr.univbrest.dosi.repositories.*;
@Repository
public class FormationRepositoryList implements FormationRepository {


private List<Formation> formations;
public FormationRepositoryList() {
    formations = new ArrayList<>();
}

public List<Formation> findByNomFormation(String nomFormation) {
    return null;
}

@Override
public <S extends Formation> S save(S s) {
    this.formations.add(s);
    return s;
}

public <S extends Formation> Iterable<S> save(Iterable<S> iterable) {
    return null;
}


@Override
public Iterable<Formation> findAll() {
    return null;
}



@Override
public long count() {
    return this.formations.size();
}


public void delete(String s) {

}

@Override
public void delete(Formation formation) {

}


public void delete(Iterable<? extends Formation> iterable) {

}

@Override
public void deleteAll() {

}

@Override
public <S extends Formation> Iterable<S> saveAll(Iterable<S> entities) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Optional<Formation> findById(String id) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public boolean existsById(String id) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public Iterable<Formation> findAllById(Iterable<String> ids) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void deleteById(String id) {
	// TODO Auto-generated method stub
	
}

@Override
public void deleteAll(Iterable<? extends Formation> entities) {
	// TODO Auto-generated method stub
	
}

@Override
public Formation findByCodeFormation(String codeFormation) {
	// TODO Auto-generated method stub
	return null;
}

}