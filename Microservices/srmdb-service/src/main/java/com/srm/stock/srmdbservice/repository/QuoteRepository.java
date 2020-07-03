package com.srm.stock.srmdbservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.srm.stock.srmdbservice.model.Quote;

public interface QuoteRepository extends JpaRepository<Quote,Integer>{
 
	List<Quote> findByUserName(String username);
	
	
}
