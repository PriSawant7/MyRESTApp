package com.priyanka.app.ws;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.priyanka.app.ws.io.entity.ProductEntity;


	@Repository // to make it a repository
	public interface ProductRepository extends CrudRepository<ProductEntity, Long> { // class of obj that needs to be persistant
}
