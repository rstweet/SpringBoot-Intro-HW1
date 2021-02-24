package com.rc.productInventory.repository;

import org.springframework.data.repository.CrudRepository;

import com.rc.productInventory.model.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {
	
	

}
