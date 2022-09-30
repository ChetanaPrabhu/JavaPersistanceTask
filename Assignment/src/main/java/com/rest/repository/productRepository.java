package com.rest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rest.entity.Product;


@Repository
public interface productRepository extends CrudRepository<Product, Integer> 
{

}
