package com.coforge.training.producthive.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.coforge.training.producthive.model.Product;
import com.coforge.training.producthive.repository.ProductRepository;

/**
 * Author	:Shozaib.Zulfiqar
 * Date		:Oct 1, 2025
 * Time 		:10:51:09 AM
 * Project 	:com.coforge.training.producthive.service
 */

/*The @Service annotation tells Spring that the annotated class contains business logic. 
 * It's typically where you'll implement the core functionality of your application, 
 * such as calculations, data retrieval, or external API interactions.
 */

@Service
public class ProductService {

	private final ProductRepository prepo;

	public ProductService(ProductRepository prepo) {
		super();
		this.prepo = prepo;
	}


	public Product saveProduct(Product p) {
		return prepo.save(p);   //Invokes pre-defined method Save()of JPA Repo
	}
	public List<Product> listAll() {
		return prepo.findAll();  //Invoke pre defined method findAll() of JPA Repo
	}

	// Optional return type is to handle Null Pointer Exception
	public Optional<Product> getSingleProduct(long pid) {
		return prepo.findById(pid);            //Invokes pre-defined method findById() of JPA repository
	}

	public void deleteProduct(long pid) {
		prepo.deleteById(pid); //Invokes pre-defined method deleteById() of JPA repository
	}
	public List<Product> searchProductsByName(String name){
		   return prepo.findProductsByNameContainingIgnoreCase(name); //Invokes method with custom query
	   }



}
