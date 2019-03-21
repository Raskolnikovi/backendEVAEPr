package fr.univbrest.dosi.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import fr.univbrest.dosi.bean.Promotion;
import fr.univbrest.dosi.bean.PromotionPK;
import fr.univbrest.dosi.repositories.*;

public class PromotionRepositoryList implements PromotionRepository{
   List<Promotion> Promotions;
   public PromotionRepositoryList() {
	   Promotions = new ArrayList<>();
   }
   
	@Override
	public <S extends Promotion> S save(S entity) {
		if (!this.Promotions.contains(entity))//ajout
            this.Promotions.add(entity);
        else{
            Promotions.remove(entity);
            Promotions.add(entity);
        }
        return entity;
	}
	

	@Override
	public <S extends Promotion> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Promotion> findById(PromotionPK id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(PromotionPK id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Promotion> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Promotion> findAllById(Iterable<PromotionPK> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return Promotions.size();
	}

	@Override
	public void deleteById(PromotionPK id) {
		Promotions.removeIf(promotion -> promotion.getId().equals(id));		}

	@Override
	public void delete(Promotion entity) {
			
	}

	@Override
	public void deleteAll(Iterable<? extends Promotion> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public List<Promotion> findByFormationCodeFormation(String codeFormation) {
		return Promotions.stream().filter(promotion -> promotion.getFormation().getCodeFormation().equals(codeFormation)).collect(Collectors.toList());
	}
	

}
