package pl.deltacore.main.core.domain;

import java.util.LinkedList;
import java.util.List;

import pl.deltacore.main.core.persistence.entity.Product;

public class OrderAggregate {
	
	List<Product> products = new LinkedList<Product>();
	
	public void finalize(){
		// finalize trasaction
	}
	
	public void addProduct(Product p){
		products.add(p);
	}
}
