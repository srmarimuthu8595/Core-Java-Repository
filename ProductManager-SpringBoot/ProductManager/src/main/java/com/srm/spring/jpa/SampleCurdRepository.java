package com.srm.spring.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface SampleCurdRepository extends CrudRepository<Product, Long> {
	
	
	/*
	@Query("select * from Product")
	public List<Product> getProductsByByCurd();
	
	@Query("Insert into Product values(")
	public void saveProductByCurd();
	
	
	
	
	
	
	public List<Product> findByItem(String item);
    
    @Query("select * from Product e WHERE e.amount >= :amount")
    public List<Product> getProductsByPrice(@Param("amount") float amount);*/

}