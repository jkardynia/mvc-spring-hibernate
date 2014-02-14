package pl.deltacore.main.core.domain;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import pl.deltacore.main.core.persistence.entity.Product;
import pl.deltacore.main.core.persistence.repository.ProductsRepository;

public class OrderAggregate {
	
	List<Product> products = new LinkedList<Product>();
	
	@Autowired
	ProductsRepository productsRepo;
	
	public void finalize(){
		// finalize trasaction
	}
	
	public void addProduct(Long productId){
		Product p = productsRepo.load(productId);
		
		if(null != p){
			products.add(p);
		}
	}
}
