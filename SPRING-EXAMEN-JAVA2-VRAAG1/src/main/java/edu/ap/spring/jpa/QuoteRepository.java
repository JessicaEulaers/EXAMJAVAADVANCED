package edu.ap.spring.jpa;

import java.awt.print.Pageable;

import org.springframework.data.domain.Page;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuoteRepository extends CrudRepository<Quote, Long> {
	Page<Quote> findAll(Pageable pageable);

	Quote findByidAllIgnoringCase(long id);
}

