package com.rest.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rest.entity.Product;

import com.rest.service.ProductService;


@RestController
//@RequestMapping("/rest/hello")
public class MyController {
	
	@Autowired
	private ProductService service;

@GetMapping("/products")
public List<Product>getAllProduct()
{
	return service.getAllProduct();
}



//@RequestMapping(method= RequestMethod.PUT, value="/product")

@PostMapping("/addProduct")
public void addProduct(@RequestBody Product product)
{
	 this.service.addProduct(product);
}


@PutMapping("/product/{productId}")
public void updateProduct(@PathVariable String productId, @RequestBody Product  product)
{
	this.service.updateProduct(Integer.parseInt(productId), product);
}

@DeleteMapping("delproduct/{productId}")
public void deleteProduct(@PathVariable int productId)
{
    this.service.deleteProduct(productId);
}

}
