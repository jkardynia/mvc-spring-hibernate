package pl.deltacore.main.core.service;

import java.util.List;

import pl.deltacore.main.core.dto.OrderProductRequest;
import pl.deltacore.main.core.persistence.entity.Product;

public interface ProductsService {
	public List<Product> getProducts(String Order);
	
	public void orderProduct(OrderProductRequest req);
	
	public Product getProduct(String id);
}
