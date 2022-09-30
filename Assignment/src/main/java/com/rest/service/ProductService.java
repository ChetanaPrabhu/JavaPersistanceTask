package com.rest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.entity.Product;
import com.rest.repository.productRepository;

@Service

public class ProductService {
	@Autowired

	private productRepository serviceRepo;
	public List<Product> getAllProduct()
	{
		List<Product> list = new ArrayList<Product>();
		this.serviceRepo.findAll().forEach(list::add);
		return list;
		
				
	}
	
	public void addProduct(Product product)
	{
		this.serviceRepo.save(product);
		
		
		
		
	}
	
	
	public void updateProduct(Integer id , Product product)
	{
		this.serviceRepo.save(product);
	}
	


	
	public void deleteProduct(Integer id)
    {
        this.serviceRepo.deleteById(id);
    }
	
}
